package com.npring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 하위 패키지 빈 등록
@MapperScan(basePackages = "com.npring")
public class NpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(NpringApplication.class, args);
    }

}
