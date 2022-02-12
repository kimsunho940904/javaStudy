package com.npring.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Configuration : 어노테이션 기반 환경 구성 도움을 준다.
 * 이 어노테이션을 붙이고 클래스 내에 하나 이상의 @Bean 메소드를 구현하면, 스프링 컨테이너가 Bean 정의를 생성하고
 * 런타임 시 그 Bean들의 요청을 처리할 것을 선언.
 */
@Configuration
public class DataSourceConfig {
    /**
     * @ConfigurationProperties : application.properties를 참조할 때 쓰는 방법중 하나.
     */
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

}