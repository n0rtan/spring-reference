package ru.n0rtan.referenceapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources({
    @PropertySource(value = "classpath:application.properties"),
    @PropertySource(value = "classpath:application-${envTarget}.properties", ignoreResourceNotFound = true)
})
public class AppPropsSource {

    @Autowired
    Environment env;

    @Bean
    public String getConfigFoo() {
        return env.getProperty("config.foo");
    }
}