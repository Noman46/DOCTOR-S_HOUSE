/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noman.doctorshouse.test.connection;

import com.noman.doctorshouse.config.SpringRootConfig;
import javax.sql.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Noman Ibrahim
 */
public class testConnection {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        DataSource ds = ctx.getBean(DataSource.class);
        JdbcTemplate js = new JdbcTemplate(ds);
        
        String sql = "INSERT INTO student(`studentId`, `name`, `phone`, `email`, `address`, `dept`, `session`, `password`) VALUES(?,?,?,?,?,?,?,?)";
        Object [] param = new Object[]{"IT-12046","Ibrahim", "01789298773", "nomanibrahim7@gmail.com", "savar,dhaka", "ICT", "2011-2012", "123"};
        js.update(sql, param);
        System.out.println("---- SQL UPDATED -------");

    }
}
