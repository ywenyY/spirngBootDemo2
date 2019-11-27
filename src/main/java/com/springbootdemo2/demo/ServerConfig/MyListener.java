package com.springbootdemo2.demo.ServerConfig;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("服务器启动-----");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("服务器销毁---------");
    }
}
