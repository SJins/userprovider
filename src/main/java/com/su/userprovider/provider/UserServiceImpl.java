package com.su.userprovider.provider;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.su.common.util.ResultUtil;
import com.su.common.vo.ResultVo;
import com.su.dao.user.UserMapper;
import com.su.domain.user.User;
import com.su.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Jin
 * @since 2019-01-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userDao;

    @Override
    public ResultVo register(User user) {
        return ResultUtil.exec(userDao.insert(user), user);
    }


    @Override
    public ResultVo checkPhone(String s) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("phone", s);
        User user = userDao.selectOne(queryWrapper);
        if (user != null) {
            return ResultUtil.execERROR();
        } else {
            return ResultUtil.execOK();
        }


    }

    @Override
    public ResultVo login(String s, String s1) {
        return null;
    }

    @Override
    public ResultVo loginout(String s) {
        return null;
    }

    @Override
    public ResultVo queryHome(String s) {
        return null;
    }
}
