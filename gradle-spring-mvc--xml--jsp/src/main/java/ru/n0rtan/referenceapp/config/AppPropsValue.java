package ru.n0rtan.referenceapp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppPropsValue {

    @Value("${config.foo}")
    private String configFoo;

    public String getConfigFoo() {
        return configFoo;
    }
}
