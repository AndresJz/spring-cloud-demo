package com.test.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.MethodHandles;

@RestController
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());


    private Client2 client2;
    private CustomProp customProp;

    public Controller(final Client2 client2, final CustomProp customProp) {
        this.client2 = client2;
        this.customProp = customProp;
    }

    @GetMapping("/")
    public String welcome(){

        logger.info("Running App 1");
        return customProp.getValue();
    }

    @GetMapping("/client2")
    public String invokeClient2App(){
        logger.info("invoke App2");
        return client2.welcome();
    }
}
