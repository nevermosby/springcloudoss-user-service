package io.davidli.springcloudoss.user;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class UserServiceApplication {

	@RequestMapping(value = "/user/{name}")
    public String echoStudentName(@PathVariable(name = "name") String name)
    {
        return "<strong style=\"color: blue;\">" + name + " </strong> Responsed on : " + new Date();
    }
	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}
}
