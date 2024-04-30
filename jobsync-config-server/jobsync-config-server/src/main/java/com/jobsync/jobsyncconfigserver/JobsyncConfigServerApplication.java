package com.jobsync.jobsyncconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class JobsyncConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobsyncConfigServerApplication.class, args);
	}

}