package com.springbootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ChuengHowGump on 2017/9/20.
 */

@RestController
public class HelloController {

    @Value("${personName}")
    private String personName;

    @Value("${personUniversity}")
    private String personUniversity;

    @Value("${personAge}")
    private int personAge;

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String say(){
        return personName + "@"+ personUniversity +", Hello Spring boot! " + personAge;
    }

    @Autowired
    private GameProperties gameProperties;

    @RequestMapping(value="/game", method = RequestMethod.GET)
    public String say2(){
        return gameProperties.getName()+" : "+gameProperties.getType();
    }

}
