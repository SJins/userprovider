package com.su.userprovider.druid;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/druid/*", initParams = {
        @WebInitParam(name = "loginUsername", value = "Jin"), // 用户名
        @WebInitParam(name = "loginPassword", value = "111"), // 密码
        @WebInitParam(name = "resetEnable", value = "true")})
public class DruidServlet extends StatViewServlet {
}