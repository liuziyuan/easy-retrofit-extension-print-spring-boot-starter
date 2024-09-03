package io.github.liuziyuan.retrofit.extension.spring.boot.print;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrintSpringBootConfig {

    @Bean
    @ConditionalOnMissingBean
    public PrintInterceptor retrofitCloudInterceptor() {
        return new PrintInterceptor();
    }
}
