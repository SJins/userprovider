package com.su.userprovider.provider;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.su.common.constant.SystemConst;
import com.su.common.token.TokenUtil;
import com.su.common.util.JedisUtil;
import com.su.common.util.ResultUtil;
import com.su.common.vo.ResultVo;
import com.su.dao.user.UserMapper;
import com.su.dao.user.UserdetialMapper;
import com.su.domain.user.User;
import com.su.domain.user.Userdetial;
import com.su.service.user.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service("userprovider")
public class UserProvider extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userDao;

    @Autowired
    private JedisUtil jedisUtil;

    @Override
    public ResultVo register(User user) {
        return ResultUtil.exec(userDao.insert(user), user);
    }



    @Override
    public ResultVo checkPhone(String phone) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("phone", phone);
        User user = userDao.selectOne(queryWrapper);
        if (user != null) {
            return ResultUtil.execERROR();
        } else {
            return ResultUtil.execOK();
        }


    }

    @Override
    public ResultVo login(String phone, String password) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("phone", phone);
        User user = userDao.selectOne(queryWrapper);
        // 验证用户是否存在
        if (user != null) {
            // 校验密码
            if (Objects.equals(user.getPassword(), password)) {
                // 1. 生成Token
                String token = TokenUtil.createToken(user);
                // 2. 将Token保存到Redis
                jedisUtil.save("usertokens", "user:" + token, user.getPhone());
                // 3. 将Token传递到前端
                return ResultUtil.execOK(token);
            }
        }
        return ResultUtil.execERROR();
    }

    @Override
    public ResultVo loginout(String token) {
       if (jedisUtil.checkFiled(SystemConst.TOKENMAP, "user:" + token)) {
           jedisUtil.del(SystemConst.TOKENMAP, "user:" + token);
       }
        return ResultUtil.execOK();
    }

    @Override
    public ResultVo queryHome(String token) {
        return null;
    }
}
