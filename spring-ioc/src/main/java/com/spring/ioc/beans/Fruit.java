package com.spring.ioc.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class Fruit {
    private String type;

    @Autowired
    private Apple apple;
}
