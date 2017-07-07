package com.github.diegopacheco.springcloud.hello;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.event.InstanceRegisteredEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import de.codecentric.boot.admin.config.EnableAdminServer;
import de.codecentric.boot.admin.discovery.ApplicationDiscoveryListener;

@Configuration
@EnableAutoConfiguration
@PropertySource("classpath:/application.properties")
@EnableAdminServer
public class AdminApp {
	
	public static void main(String[] args) {
		SpringApplication.run(AdminApp.class, args);
	}

//	@Autowired
//	private ApplicationDiscoveryListener listener;

//	@PostConstruct
//	public void init() {
//		InstanceRegisteredEvent<?> event = new InstanceRegisteredEvent<>("prod", null);
//		listener.onInstanceRegistered(event);
//	}
}
