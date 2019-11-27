package com.springbootdemo2.demo.ServerConfig;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContextListener;
import java.util.Collections;

public class ServletCofnig {

    public ServletRegistrationBean MyServlet(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new MyServlet());
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean MyFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter());
        filterRegistrationBean.setUrlPatterns(Collections.singleton("/"));
        return filterRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean MyListener(){
       ServletListenerRegistrationBean servletListenerRegistrationBean = new ServletListenerRegistrationBean(new MyListener());
       return servletListenerRegistrationBean;
    }
}
