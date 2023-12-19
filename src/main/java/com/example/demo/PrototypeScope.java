package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

public class PrototypeScope {
    public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SingletonScope.class, args);
		Home3 h = context.getBean(Home3.class);
		h.connect();

        Home3 h2= context.getBean(Home3.class);
        h2.connect();
	}

}
