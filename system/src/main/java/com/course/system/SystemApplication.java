package com.course.system;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;

/**
 * @author awei
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.course.system.mapper")
public class SystemApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(SystemApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SystemApplication.class);
        Environment environment = app.run(args).getEnvironment();
        LOGGER.info("launch success !!");
        LOGGER.info("system address :\t http:127.0.0.1:{}", environment.getProperty("server.port"));
    }
}
