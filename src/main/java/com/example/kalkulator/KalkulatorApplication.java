package com.example.kalkulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KalkulatorApplication {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println("Dodawanie: "+calculator.addition());
        System.out.println("Odejmowanie: "+calculator.subtraction());
    }
}
