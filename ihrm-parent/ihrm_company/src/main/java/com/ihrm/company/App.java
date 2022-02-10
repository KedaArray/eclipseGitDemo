package com.ihrm.company;

import org.ihrm.common.entity.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = "com.ihrm")
@EntityScan(value = "com.ihrm.domain.company")
public class App 
{
    public static void main( String[] args )
    {
      SpringApplication.run(App.class, args);
    }

    @Bean
    public IdWorker idWorker() {
      return new IdWorker();
    }
}
