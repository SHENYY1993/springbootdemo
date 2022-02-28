package com.shenyy.package1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 该注解表示开启自动化配置。由于项目中添加了spring-boot-starterweb依赖，因此在开启了自动化配置之后会自动进行Spring和Spring MVC的配置。
 * 也可以直接使用组合注解@Spring BootApplication来代替@EnableAutoConfiguration和@ComponentScan*/
@SpringBootApplication
@EnableAutoConfiguration
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);  //通过SpringApplication中的run方法启动项目。第一个参数传入App.class，告诉Spring哪个是主要组件。第二个参数是运行时输入的其他参数。
    }
}
