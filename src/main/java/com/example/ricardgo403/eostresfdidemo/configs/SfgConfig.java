package com.example.ricardgo403.eostresfdidemo.configs;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/***
 @author @ricardgo403., All Rights Reserved.
 Copyright 2021
 Created on 03/05/21
 ***/
@ConfigurationProperties("clinic")
@Configuration
public class SfgConfig {
    private String username;
    private String password;
    private String jdbcUrl;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }
}
