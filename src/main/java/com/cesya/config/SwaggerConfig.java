package com.cesya.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.PathSelectors;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket swaggerFoodApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Foods")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.cesya.controller"))
                .paths(PathSelectors.ant("/api/food/*"))
                .build();

    }

    @Bean
    public Docket swaggerStudentApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Students")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.cesya.controller"))
                .paths(PathSelectors.ant("/api/student/*"))
                .build();

    }
}
