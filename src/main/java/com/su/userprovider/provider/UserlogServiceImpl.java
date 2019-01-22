package com.su.userprovider.provider;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.su.dao.user.UserlogMapper;
import com.su.domain.user.Userlog;
import com.su.service.user.IUserlogService;
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
public class UserlogServiceImpl extends ServiceImpl<UserlogMapper, Userlog> implements IUserlogService {

}
