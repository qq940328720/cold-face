package swaggerconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.HashSet;
import java.util.Set;

//@EnableWebMvc
//@ComponentScan(basePackages = {"com.cold.face.web.controller"})
@EnableSwagger2
@Configuration
public class SwaggerCnf {

//    @Bean
//    public Docket createRestApi() {
////        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.cold.face.web.controller")).paths(PathSelectors.any()).build();
//        Set<String> headers = new HashSet<>();
//        headers.add("application/json; charset=UTF-8");
//        return new Docket(DocumentationType.SWAGGER_2).produces(headers).consumes(headers).apiInfo(new ApiInfoBuilder().build())
//                .securitySchemes(Lists.newArrayList(new ApiKey("a", "b", "c"))).select()
//                .apis(RequestHandlerSelectors.basePackage("com.cold.face.web.controller")).paths(PathSelectors.any()).build();
//    }


    @Bean
    public Docket createRestApi() {
        Set<String> headers = new HashSet<>();
        headers.add("application/json; charset=UTF-8");
        return new Docket(DocumentationType.SWAGGER_2)
                .produces(headers)
                .consumes(headers)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.cold.face.web.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("NightOwl RESTful APIs")
                .description("关注我 http://hwangfantasy.github.io/")
                .termsOfServiceUrl("http://hwangfantasy.github.io/")
                .version("1.0")
                .build();
    }
}
