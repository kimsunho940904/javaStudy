package com.apring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 하위 패키지 빈 등록
@MapperScan(basePackages = "com.apring")
public class ApringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApringApplication.class, args);
    }

}
