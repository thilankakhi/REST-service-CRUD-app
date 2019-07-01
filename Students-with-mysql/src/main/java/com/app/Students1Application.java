package com.app;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.app.dao.LecturerRepository;
import com.app.dao.StudentRepository;


@SpringBootApplication
@EnableJpaRepositories(basePackageClasses= {StudentRepository.class, LecturerRepository.class})

public class Students1Application {

    private static final Logger logger = LogManager.getLogger(Students1Application.class);
	
	public static void main(String[] args) {
		logger.info("Starting student CRUD application");
		SpringApplication.run(Students1Application.class, args);
	}

}
