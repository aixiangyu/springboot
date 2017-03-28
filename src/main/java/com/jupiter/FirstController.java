package com.jupiter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by aixiangyu on 2017/3/2.
 */
@RestController
@EnableAutoConfiguration
public class FirstController {

    /**
     * Home string.
     *
     * @return the string
     */
    @RequestMapping("/")
    public String home(){

        return "hello world!";
    }

    public static void main(String[] args) throws  Exception {
        SpringApplication.run(FirstController.class,args);

    }
}
