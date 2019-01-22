package com.su.userprovider.provider;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.su.common.token.TokenUtil;
import com.su.common.util.ResultUtil;
import com.su.common.vo.ResultVo;
import com.su.dao.user.UserdetialMapper;
import com.su.domain.user.Userdetial;
import com.su.service.user.IUserdetialService;
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
@Service("userdetialserviceimpl")
public class UserdetialServiceImpl extends ServiceImpl<UserdetialMapper, Userdetial> implements IUserdetialService {
    @Autowired
    private UserdetialMapper userdetialDao;



    @Override
    public ResultVo update(String token, Userdetial userdetial) {
        userdetial.setUid(TokenUtil.parseToken(token).getId());

        return ResultUtil.exec(userdetialDao.updateById(userdetial), userdetial);
    }

    @Override
    public ResultVo queryById(String token) {
        return ResultUtil.execOK(userdetialDao.selectById(TokenUtil.parseToken(token).getId()));
    }
}
