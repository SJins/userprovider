package com.su.userprovider.provider;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.su.dao.user.UserrecMapper;
import com.su.domain.user.Userrec;
import com.su.service.user.IUserrecService;
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
public class UserrecServiceImpl extends ServiceImpl<UserrecMapper, Userrec> implements IUserrecService {

}
