package com.springframework.demo.interceptor;

import com.springframework.demo.annotation.TestPark;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestInterceptor1 implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(TestInterceptor1.class);

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler)
            throws Exception {
        logger.info(">>>>>>>>>>>>>>>>>>>>>>>>> preHandle 1 ");

        if(handler instanceof HandlerMethod){
            TestPark testPark = ((HandlerMethod) handler).getMethodAnnotation(TestPark.class);
            logger.info("testPark = {}", testPark.type().name());
        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        logger.info(">>>>>>>>>>>>>>>>>>>>>>>>> postHandle 1 ");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        logger.info(">>>>>>>>>>>>>>>>>>>>>>>>> afterCompletion 1 ");
    }
}
