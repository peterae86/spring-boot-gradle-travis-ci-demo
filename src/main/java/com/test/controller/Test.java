package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by test on 2015/12/16.
 */
@Controller
public class Test {
    @RequestMapping("/test")
    public ModelAndView test() {
        return new ModelAndView("vm/test");
    }
}
