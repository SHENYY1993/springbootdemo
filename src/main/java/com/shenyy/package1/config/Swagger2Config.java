package com.shenyy.package1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {
    //通过apis方法配置要扫描的controller位置，通过paths方法配置路径。
    //在apiInfo中构建文档的基本信息，例如描述、联系人信息、版本、标题等。
//    @Bean
//    Docket docket() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.shenyy.package1.controller"))
//                .paths(PathSelectors.any())
//                .build().apiInfo(new ApiInfoBuilder()
//                        .description("出苗率检测模块接口文档")
//                        .contact(new Contact("shenyy", "https://github.com/lenve", "shenyy@eav.top"))
//                        .version("v1.0")
//                        .title("API测试文档")
//                        .license("Apache2.0")
//                        .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
//                        .build());
//    }

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                //是否开启 (true 开启  false隐藏。生产环境建议隐藏)
                //.enable(false)
                .select()
                //扫描的路径包,设置basePackage会将包下的所有被@Api标记类的所有方法作为api
                .apis(RequestHandlerSelectors.basePackage("com.shenyy.package1.controller"))
                //指定路径处理PathSelectors.any()代表所有的路径
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //设置文档标题(API名称)
                .title("出苗率检测模块后台接口规范")
                //文档描述
                .description("接口说明")
                //服务条款URL
                .termsOfServiceUrl("http://localhost:8080/")
                //版本号
                .version("1.0")
                .build();
    }
}
