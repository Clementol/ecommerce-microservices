package com.codingshuttle.ecommerce.api_gateway.filters;

import lombok.extern.slf4j.Slf4j;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.NullMarked;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class GlobalLoggingFilter implements GlobalFilter, Ordered {
    @Override
    public @NonNull Mono<Void> filter(@NonNull ServerWebExchange exchange, GatewayFilterChain chain) {
        // pre-filter
        log.info("Logging from Global Pre: {}", exchange.getRequest().getURI());
        return chain.filter(exchange).doOnSuccess( aVoid -> {
            log.info("Logging from Global Post: {}", exchange.getResponse().getStatusCode());
        });
    }

    @Override
    public int getOrder() {
        return 5;
    }
}
