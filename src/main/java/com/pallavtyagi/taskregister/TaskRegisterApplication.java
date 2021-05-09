package com.pallavtyagi.taskregister;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(value = {"com.pallavtyagi.taskregister"})
@EnableMongoRepositories
@Log4j2
public class TaskRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskRegisterApplication.class, args);
	}

}
