package com.fintech.payments.infrastructure.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuración centralizada de OpenAPI/Swagger para documentación de la API.
 * Define la información de la API, esquemas de seguridad y personalización visual.
 */
@Configuration
public class OpenApiConfig {

    private static final String API_TITLE = "Fintech Payments API";
    private static final String API_VERSION = "1.0.0";
    private static final String API_DESCRIPTION = "API REST para la gestión de pagos y transacciones financieras. "
            + "Proporciona endpoints seguros para autenticación, gestión de usuarios y procesamiento de pagos. "
            + "Requiere autenticación JWT Bearer para acceder a los endpoints protegidos.";
    private static final String SCHEME_NAME = "Bearer Authentication";
    private static final String SCHEME_DESCRIPTION = "JWT Bearer Token authentication. "
            + "Obtener el token mediante el endpoint POST /api/v1/auth/login";

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title(API_TITLE)
                        .version(API_VERSION)
                        .description(API_DESCRIPTION)
                        .contact(new Contact()
                                .name("Fintech Payments Team")
                                .email("support@fintech-payments.com")
                                .url("https://www.fintech-payments.com"))
                        .license(new License()
                                .name("Proprietary")
                                .url("https://www.fintech-payments.com/legal")))
                .addSecurityItem(new SecurityRequirement().addList(SCHEME_NAME))
                .components(new Components()
                        .addSecuritySchemes(SCHEME_NAME,
                                new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")
                                        .description(SCHEME_DESCRIPTION)));
    }
}