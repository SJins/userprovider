package com.su.userprovider.provider;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.su.dao.user.UserwalletMapper;
import com.su.domain.user.Userwallet;
import com.su.service.user.IUserwalletService;
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
public class UserwalletServiceImpl extends ServiceImpl<UserwalletMapper, Userwallet> implements IUserwalletService {

}
