package com.springframework.demo.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestInterceptor2 implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(TestInterceptor2.class);

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        logger.info(">>>>>>>>>>>>>>>>>>>>>>>>> preHandle 2 ");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        logger.info(">>>>>>>>>>>>>>>>>>>>>>>>> postHandle 2 ");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        logger.info(">>>>>>>>>>>>>>>>>>>>>>>>> afterCompletion 2 ");
    }
}
