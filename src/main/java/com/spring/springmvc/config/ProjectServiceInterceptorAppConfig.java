package com.spring.springmvc.config;

import com.spring.springmvc.interceptors.LogInterceptor;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ProjectServiceInterceptorAppConfig extends WebMvcConfigurerAdapter {
    private LogInterceptor logInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(logInterceptor);
    }
}
