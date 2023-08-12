package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ConfigurableApplicationContext run = SpringApplication.run(App.class, args);
        String property = run.getEnvironment().getProperty("wsy.name");
        String property1 = run.getEnvironment().getProperty("wsy.age");
        System.out.println(property +"---"+ property1 );
    }
//    @Bean
//    public RestTemplate restTemplate(RestTemplateBuilder builder) {
//        RestTemplate build = builder.build();
//        return build;
//    }

}
