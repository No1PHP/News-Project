package com.imooc.api.config;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Zhining
 * @description
 * @create 2021-10-25-16-09
 **/
@Configuration
@EnableSwagger2
public class Swagger {
  @Bean
  public Docket createRestApi() {
    //scan different controllers
    Predicate<RequestHandler> adminPredicate = RequestHandlerSelectors.basePackage("com.imooc.admin.controller");
    Predicate<RequestHandler> articlePredicate = RequestHandlerSelectors.basePackage("com.imooc.article.controller");
    Predicate<RequestHandler> userPredicate = RequestHandlerSelectors.basePackage("com.imooc.user.controller");
    Predicate<RequestHandler> filesPredicate = RequestHandlerSelectors.basePackage("com.imooc.files.controller");

    return new Docket(DocumentationType.SWAGGER_2)  // 指定api类型为swagger2
        .apiInfo(apiInfo())                 // 用于定义api文档汇总信息
        .select()
        .apis(Predicates.or(userPredicate, adminPredicate, filesPredicate))
//                .apis(Predicates.or(adminPredicate, articlePredicate, userPredicate, filesPredicate))
        .paths(PathSelectors.any())         // 所有controller
        .build();
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        .title("news project api")                       // 文档页标题
        .contact(new Contact("zn",
            "",
            ""))                   // 联系人信息
        .description("api documentation")      // 详细信息
        .version("1.0.1")                               // 文档版本号
        .termsOfServiceUrl("")     // 网站地址
        .build();
  }

}
