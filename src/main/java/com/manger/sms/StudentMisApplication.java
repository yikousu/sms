package com.manger.sms;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.manger.sms.dao")
public class StudentMisApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudentMisApplication.class, args);
        log.info("启动成功--访问url:" + "http://localhost:8080/");
    }

}
