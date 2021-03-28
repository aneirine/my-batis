package com.aneirine.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.aneirine.demo.mapper")
public class PersistenceConfig {


}
