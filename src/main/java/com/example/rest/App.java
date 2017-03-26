package com.example.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

/**
 * Created by gonzalo.gisbert on 26/03/17.
 */
@SpringBootApplication
public class App {

    public static final Properties myProps = new Properties();

    public static void main(String[] args){

        //Set properties
        myProps.setProperty("server.address", "localhost");
        myProps.setProperty("server.port", "8080");

        SpringApplication app = new SpringApplication(App.class);
        app.setDefaultProperties(myProps);
        app.run(args);

    }
}
