package com.vedannt.quickStart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by vedannt on 9/18/16.
 */

@EnableAutoConfiguration
@Controller
public class QuickStart {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody String hello(){
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(QuickStart.class, args);
    }
}
