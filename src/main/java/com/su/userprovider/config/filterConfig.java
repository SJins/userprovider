package com.su.userprovider.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CharacterEncodingFilter;

import java.io.File;

/**
 * @author Jin
 * @date 2019/1/21 18:09
 */
public class filterConfig {

    @Bean
    public FilterRegistrationBean createEncoding() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setFilter(new CharacterEncodingFilter());
        filterRegistrationBean.addInitParameter("encoding", "UTF-8");
        return filterRegistrationBean;
    }
}
