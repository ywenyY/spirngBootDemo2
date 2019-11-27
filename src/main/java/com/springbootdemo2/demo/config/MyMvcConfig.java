package com.springbootdemo2.demo.config;

import com.springbootdemo2.demo.component.MylocalResolver;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class MyMvcConfig {

    @Bean
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/main.html").setViewName("index");
                //registry.addViewController("/login.html").setViewName("login");
                registry.addViewController("/").setViewName("index");
            }

            @Override
            public void addInterceptors(InterceptorRegistry registry) {        //可以挨着添加
                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").
                        excludePathPatterns("/test","/","/static/**","/css/**");
            }
        };
        return adapter;
    }

    @Bean
    public LocaleResolver MylocalResolver(){
        return new MylocalResolver();
    }
}
