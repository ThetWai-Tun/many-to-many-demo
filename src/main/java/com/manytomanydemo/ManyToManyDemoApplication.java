package com.manytomanydemo;

import com.manytomanydemo.service.IDatabase;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ManyToManyDemoApplication {

    private final IDatabase iDatabase;

    public ManyToManyDemoApplication(IDatabase iDatabase) {
        this.iDatabase = iDatabase;
    }

    public static void main(String[] args) {

        SpringApplication.run(ManyToManyDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(){
        return a ->{
            iDatabase.createTable();
        };
    }
}
