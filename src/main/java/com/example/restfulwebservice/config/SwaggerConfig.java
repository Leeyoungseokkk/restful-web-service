package com.example.restfulwebservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;

import springfox.documentation.service.ApiInfo;

import springfox.documentation.service.Contact;
import springfox.documentation.service.Server;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.*;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private static final String API_NAME = "SENSE KOREA PROJECT";
    private static final String API_DESCRIPTION = "SENSE KOREA PROJECT BACK END SWAGGER";

    private static final Contact DEFAULT_CONTACT = new Contact("SenseKorea","http://sensekorea.com","myejrrp123@naver.com");
    private static final ApiInfo DEFAULT_API_INFO = new ApiInfo("Sense Korea","Rest API", "1.1","urn:tos", DEFAULT_CONTACT, "Apche 2.0",
            "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<>());
    private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = new HashSet<>(
            Arrays.asList("application/json","application/xml"));
    @Bean
    public Docket api(){
        //Server serverLocal = new Server("local", "http://localhost:8088", "for local usages", Collections.emptyList(), Collections.emptyList());
        return new Docket(DocumentationType.SWAGGER_2)
                //.servers(serverLocal)
                .apiInfo(DEFAULT_API_INFO)
                .produces(DEFAULT_PRODUCES_AND_CONSUMES)
                .consumes(DEFAULT_PRODUCES_AND_CONSUMES);
        /*
        springfox.documentation.service.Parameter parameterBuilder = new ParameterBuilder()
                .name(HttpHeaders.AUTHORIZATION)
                .description("Access Tocken")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .required(false)
                .build();

        List<Parameter> globalParamters = new ArrayList<>();
        globalParamters.add(parameterBuilder);
        */

    }

    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(API_NAME)
                .description(API_DESCRIPTION)
                .build();
    }
}
