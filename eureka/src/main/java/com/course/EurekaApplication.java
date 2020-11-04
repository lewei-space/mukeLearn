package com.course;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.Environment;
/**
 * @author awei
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
	private static  final Logger LOGGER= LoggerFactory.getLogger(EurekaApplication.class);
//	public static void main(String[] args) {
//		SpringApplication.run(EurekaApplication.class, args);
//	}
	public static void main(String[] args) {
	SpringApplication app=	new SpringApplication(EurekaApplication.class);
		Environment environment=app.run(args).getEnvironment();
		LOGGER.info("launch success !!");
		LOGGER.info("EUREKA address :\t http:127.0.0.1:{}",environment.getProperty("server.port"));
	}


}
