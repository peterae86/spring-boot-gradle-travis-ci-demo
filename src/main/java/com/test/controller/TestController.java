package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * Created by test on 2015/12/16.
 */
@Controller
public class TestController {
    @RequestMapping("/test")
    @ResponseBody
    public Object test() {
        return new HashMap<Object, Object>() {
            {
                put("test", "test");
            }
        };
    }
}
