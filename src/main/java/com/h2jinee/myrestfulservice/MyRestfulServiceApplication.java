package com.h2jinee.myrestfulservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyRestfulServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyRestfulServiceApplication.class, args);

//        String[] allBeanNames = ac.getBeanDefinitionNames();
//        for (String beanName : allBeanNames) {
//            System.out.println(beanName);
//        }
    }

}
