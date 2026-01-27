package com.watchden.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayRouteConfig {

    @Bean
    public RouteLocator watchDenRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("room-service", r -> r
                        .path("/rooms", "/rooms/**")
                        .uri("lb://ROOM-SERVICE")
                )
                .build();
    }
}
