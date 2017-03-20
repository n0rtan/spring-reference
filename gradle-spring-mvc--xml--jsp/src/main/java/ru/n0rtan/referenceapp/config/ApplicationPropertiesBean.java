package ru.n0rtan.referenceapp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class ApplicationPropertiesBean implements Serializable {

    @Value("${config.foo}")
    private String configFoo;

    public void setConfigFoo(String configFoo) {
        this.configFoo = configFoo;
    }

    public String getConfigFoo() {
        return configFoo;
    }

    @Override
    public String toString() {
        return configFoo;
    }
}
