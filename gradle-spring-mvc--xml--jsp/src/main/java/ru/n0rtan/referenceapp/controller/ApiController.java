package ru.n0rtan.referenceapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class ApiController {

    private static final Logger logger = LoggerFactory.getLogger(ApiController.class);

    @Autowired
    private ApplicationContext appContext;

    @RequestMapping(value = "/rest", method = RequestMethod.GET, produces={"text/plain;charset=UTF-8"})
    public String rest() {

        logger.info("REST action used");

        return "REST Response";
    }
}
