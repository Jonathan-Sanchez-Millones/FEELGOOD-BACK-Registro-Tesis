package edu.moduloalumno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.support.SpringBootServletInitializer;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class App{// extends SpringBootServletInitializer{// Sin nada de esto para el heroku

	public static void main(String[] args){
		SpringApplication.run(App.class, args);
	}
        /*
        @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
            return application.sources(App.class);
        }*/
}
