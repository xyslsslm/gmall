package com.xysl.gmall.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
public class GmallUsrApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallUsrApplication.class, args);
    }

}
