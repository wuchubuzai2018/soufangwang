package com.imooc.xunwuproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

/**
 * DataSourceAutoConfiguration.class,
 *         HibernateJpaAutoConfiguration.class,
 */
@SpringBootApplication(exclude={ SecurityAutoConfiguration.class})
public class XunwuProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(XunwuProjectApplication.class, args);
    }

}
