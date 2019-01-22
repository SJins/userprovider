package com.su.userprovider.config;

import com.su.common.util.JedisUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jin
 * @date 2019/1/21 20:45
 */
@Configuration
public class JedisConfig {
    @Bean
    public JedisUtil creareJedis() {
        return new JedisUtil("39.105.189.141",6379, "qfjava");
    }
}
