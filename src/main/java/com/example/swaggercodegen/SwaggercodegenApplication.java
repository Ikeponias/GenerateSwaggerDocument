package com.example.swaggercodegen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
    info = @Info(
        title = "サンプルAPIのタイトルです",
        version = "1.0",
        description = "サンプルAPIの説明です",
        license = @License(name = "ライセンス名", url = "https://qiita.com/Ikeponias"),
        contact = @Contact(url = "https://qiita.com/Ikeponias", name = "Ikeponias", email = "Ikeponias@Ikeponias.com")),
    tags = {},
    externalDocs = @ExternalDocumentation(description = "外部ドキュメント"),
    security = {},
    servers = {
        @Server(
            description = "サーバ説明",
            url = "https://qiita.com/Ikeponias",
            variables = {})
    })
	
@SpringBootApplication
public class SwaggercodegenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggercodegenApplication.class, args);
	}

}
