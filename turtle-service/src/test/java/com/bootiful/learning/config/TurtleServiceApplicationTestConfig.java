package com.bootiful.learning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.util.Properties;

/**
 * Created by james on 2/24/2016.
 */
@Configuration
public class TurtleServiceApplicationTestConfig {
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() throws Exception{
        final PropertySourcesPlaceholderConfigurer props = new PropertySourcesPlaceholderConfigurer();
        Properties properties = new Properties();
        properties.setProperty("message", "test message");

        props.setProperties(properties);
        return props;
    }
}
