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
import org.springframework.web.bind.annotation.ResponseBody;
import ru.n0rtan.referenceapp.config.ApplicationPropertiesBean;

import javax.annotation.Resource;
import java.util.Locale;
import java.util.Properties;

@Controller
public class DefaultController {

    private static final Logger logger = LoggerFactory.getLogger(DefaultController.class);

    @Autowired
    private ApplicationContext appContext;

    @Autowired
    private ApplicationPropertiesBean appPropsBean;

    @Resource(name = "appProps")
    private Properties appProps;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Locale locale, Model model) {

        logger.info("Welcome home! The client locale is {}.", locale);

        model.addAttribute("message", "Assigned Message with property config.foo: " + appProps.getProperty("config.foo1", "defVal"));

        return "index";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {

        model.addAttribute("name", name);

        return "hello";
    }

    @RequestMapping(value = "/rest", method = RequestMethod.GET)
    @ResponseBody
    public String rest() {

        return "REST Response";
    }
}