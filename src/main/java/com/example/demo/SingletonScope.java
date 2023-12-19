package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

public class SingletonScope {
    public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SingletonScope.class, args);
		Home2 h = context.getBean(Home2.class);
		h.connect();

        Home2 h2= context.getBean(Home2.class);
        h2.connect();
	}


}
