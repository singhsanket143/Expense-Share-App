package com.example.expenseshare;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExpenseShareApplication {

    public static void main(String[] args) {

        Dotenv dotenv = Dotenv.configure().load(); // Loading the dotenv variables

        dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));

        SpringApplication.run(ExpenseShareApplication.class, args);
    }

}
