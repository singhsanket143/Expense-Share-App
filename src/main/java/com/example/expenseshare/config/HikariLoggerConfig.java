package com.example.expenseshare.config;

import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class HikariLoggerConfig implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(HikariLoggerConfig.class);

    @Autowired
    private DataSource dataSource;

    @Override
    public void run(String... args) {
        // This method will be called after the application context is loaded
        // You can add any initialization logic here if needed
        if (dataSource instanceof HikariDataSource hikariDataSource) {
            log.info("Hikari max pool size : " + hikariDataSource.getMaximumPoolSize());
            log.info("Hikari connection timeout : " + hikariDataSource.getConnectionTimeout());
            log.info("Hikari idle timeout : " + hikariDataSource.getIdleTimeout());
            log.info("Hikari db pool name : " + hikariDataSource.getPoolName());

        } else {
            log.info("DataSource is not an instance of HikariDataSource");
        }
    }
}
