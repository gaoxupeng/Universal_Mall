package com.mall.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class LoggingConfig {
    private static final Logger LOG = LoggerFactory.getLogger(LoggingConfig.class);

    @Bean
    public void demo(){
        LOG.info("-----demo-------");
    }
}
