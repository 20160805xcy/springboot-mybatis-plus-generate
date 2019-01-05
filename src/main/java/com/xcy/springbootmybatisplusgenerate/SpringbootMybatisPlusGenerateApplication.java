package com.xcy.springbootmybatisplusgenerate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.xcy.springbootmybatisplusgenerate.mapper")
public class SpringbootMybatisPlusGenerateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisPlusGenerateApplication.class, args);
    }

}

