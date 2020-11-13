/*
 *
 *
 * Created by IntelliJ IDEA.
 * @author: Reza Shams <rezashams86@gmail.com>
 */
package com.greenblog.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.greenblog")
@EntityScan("com.greenblog.model")
@EnableJpaRepositories("com.greenblog.repository")
public class ApiApp {

    public static  void main(String[] args) {
        SpringApplication.run(ApiApp.class,args);
    }

}