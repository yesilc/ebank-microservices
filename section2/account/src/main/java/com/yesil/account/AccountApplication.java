package com.yesil.account;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "EBank Accounts microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "yesilc",
						email = "omercanyesil@gmail.com",
						url = "https://www.yesilc.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.yesil.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "EBank Accounts microservice REST API Documentation",
				url = "https://www.yesilc.com/swagger-ui.html"
		)
)
public class AccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);

	}

}
