package com.jobsync.jobsyncadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class JobsyncAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobsyncAdminApplication.class, args);
	}

}
