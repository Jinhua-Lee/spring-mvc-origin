package com.jinhua.springmvcorigin.web.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Jinhua
 * @version 1.0
 * @date 13/04/2022 16:46
 */
public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView("mvc-hello.jsp");
        mav.addObject("message", "Hello Spring MVC");
        return mav;
    }
}
