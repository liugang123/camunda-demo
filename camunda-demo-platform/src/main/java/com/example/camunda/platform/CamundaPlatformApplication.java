package com.example.camunda.platform;


import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 应用入口
 *
 * @author : liugang
 * @date : 2022/5/26 14:11
 */
@SpringBootApplication
@EnableProcessApplication
public class CamundaPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(CamundaPlatformApplication.class, args);
    }
}
