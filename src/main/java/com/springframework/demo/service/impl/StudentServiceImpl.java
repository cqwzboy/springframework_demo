package com.springframework.demo.service.impl;

import com.springframework.demo.dao.IStudentDao;
import com.springframework.demo.entity.Student;
import com.springframework.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentDao studentDao;

    @Override
    public int add(Student student) {
        return studentDao.add(student);
    }
}
