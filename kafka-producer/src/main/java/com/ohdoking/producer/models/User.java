package com.ohdoking.producer.models;

import lombok.Getter;
import lombok.Setter;

public class User {

    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}