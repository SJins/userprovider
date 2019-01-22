package com.su.userprovider.provider;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.su.dao.user.UsershellMapper;
import com.su.domain.user.Usershell;
import com.su.service.user.IUsershellService;
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
public class UsershellServiceImpl extends ServiceImpl<UsershellMapper, Usershell> implements IUsershellService {

}
