package com.test.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.MethodHandles;

@RestController
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    private CustomProp customProp;

    public Controller(final CustomProp customProp) {
        this.customProp = customProp;
    }

    @GetMapping("/")
    public String welcome(){

        logger.info("Running App 2");
        return customProp.getValue();
    }
}
