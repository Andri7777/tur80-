package com.example.admin.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
@EnableWebMvc
public class StaticResourses extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        /*registry.addResourceHandler("/images/**").addResourceLocations("D:/braskets/multipat/Fille/img")
                .addResourceLocations("file:///D:/braskets/multipat/Fille/" );*/
        registry.addResourceHandler("/**")//.addResourceLocations("D:/braskets/multipat/Fille/img")
                .addResourceLocations("classpath:/META-INF/resources/"
                        ,"classpath:/static",
                        "classpath:/resources",
                        "classpath:/public");
    }
}
