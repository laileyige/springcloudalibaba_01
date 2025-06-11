package com.example.tanhuan.pojo;

import lombok.Data;

@Data
public class User {
    private String name;
    private Integer age;
    private String addr;

    public User(String name, Integer age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public User() {
    }
}
