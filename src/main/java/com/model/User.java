package com.model;

import org.springframework.stereotype.Component;

/**
 * Created by KevinL on 14/03/2017.
 */
@Component
public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
