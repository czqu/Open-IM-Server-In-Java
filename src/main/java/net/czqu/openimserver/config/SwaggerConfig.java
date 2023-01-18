package net.czqu.openimserver.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

/**
 * @program: Open-IM-Server-In-Java
 * @description:
 * @author: czq
 * @create: 2023-01-16 22:30
 **/
@Configuration
@EnableOpenApi
public class SwaggerConfig {
    @Value("${swagger.enabled}")
    private Boolean swaggerEnabled;

    @Bean
    public Docket docker() {
        return new Docket(DocumentationType.OAS_30).apiInfo(apiInfo()).enable(swaggerEnabled).select()
            .apis(RequestHandlerSelectors.basePackage("net.czqu.openimserver.controller")).build();
    }

    private ApiInfo apiInfo() {
        /*作者信息*/
        Contact contact = new Contact("润学研究院", "https://run.czqu.net", "run@czqu.net");
        return new ApiInfo("Opem IM", "Opem IM 接口文档", "v1.0", "https://run.czqu.net", contact, "Apache 2.0",
            "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList());
    }
}
