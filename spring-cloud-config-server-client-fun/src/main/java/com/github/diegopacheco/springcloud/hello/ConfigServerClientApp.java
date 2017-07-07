package com.github.diegopacheco.springcloud.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ConfigServerClientApp {
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerClientApp.class, args);
	}

}

@RefreshScope
@RestController
class MessageRestController {

    @Value("${message:hello}")
    private String message;

    @RequestMapping("/message")
    String getMessage() {
        return "{ \"foo\": \"" + this.message + "\" }";
    }
}
