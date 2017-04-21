package ru.n0rtan.referenceapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.n0rtan.referenceapp.config.AppPropsSource;
import ru.n0rtan.referenceapp.config.AppPropsValue;

import javax.annotation.Resource;
import java.util.Locale;
import java.util.Properties;

@Controller
public class DefaultController {

    private static final Logger logger = LoggerFactory.getLogger(DefaultController.class);

    @Autowired
    private ApplicationContext appContext;


    @Autowired
    private AppPropsValue appPropsValue;

    @Autowired
    private AppPropsSource appPropsSource;

    @Resource(name = "appPropsUtil")
    private Properties appPropsUtil;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Locale locale, Model model) {

        logger.info("Welcome home! The client locale is {} {}.", locale, System.nanoTime());

        String propertyValue =
//        ((Properties)appContext.getBean("appPropsUtil")).getProperty("config.foo");
//        appPropsUtil.getProperty("config.foo");
//        appPropsValue.getConfigFoo();
        appPropsSource.getConfigFoo();

        model.addAttribute(
            "message",
            "Assigned message with property config.foo: " + propertyValue
        );

        return "index";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {

        logger.info("Hello action with name = {}.", name);

        model.addAttribute("name", name);

        return "hello";
    }
}