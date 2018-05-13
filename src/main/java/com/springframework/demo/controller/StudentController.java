package com.springframework.demo.controller;

import com.springframework.demo.entity.Student;
import com.springframework.demo.service.IStudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private IStudentService studentService;

    @GetMapping("/add")
    public String add(
            @RequestParam(value = "name", required = true) String name
    ){
        logger.debug("name = {}", name);

        Student student = new Student(name);

        int rownum = studentService.add(student);

        if(rownum == 1){
            logger.debug("insert success");
            return "success";
        }else{
            logger.debug("insert failed");
            return "failed";
        }
    }

}
