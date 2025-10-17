package com.coding.store;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Coding Products",
                version = "1.0",
                description = "A Store sells coding products"
        )
)
public class Swagger {
}
