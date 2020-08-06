package com.example.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 这是eureka注册中心
 * 测试多模块情况下提交
 * 测试下分支创建
 * 主分支提交测试
 * 未提交情况下创建分支
 */
@EnableEurekaServer
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * 这是测试分支的代码
     * v1.0 测试提交
     */
}
