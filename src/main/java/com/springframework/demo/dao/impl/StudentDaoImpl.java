package com.springframework.demo.dao.impl;

import com.springframework.demo.dao.IStudentDao;
import com.springframework.demo.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class StudentDaoImpl implements IStudentDao {

    private static final Logger logger = LoggerFactory.getLogger(StudentDaoImpl.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.name}")
    private String userName;
    @Value("${jdbc.password}")
    private String password;

    @Override
    public int add(Student student) {
        String sql = "insert into student (name) values (?)";
        Object[] args = {student.getName()};
        return jdbcTemplate.update(sql, args);

        /*logger.debug("driver={}, url={}, userName={}, password={}", driver, url, userName, password);
        int rownum = 0;
        Connection connection = null;
        PreparedStatement pstat = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, userName, password);
            String sql = "insert into student (name) values (?)";
            pstat = connection.prepareStatement(sql);
            pstat.setString(1, student.getName());
            rownum = pstat.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(pstat != null){
                try {
                    pstat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return rownum;*/
    }
}
