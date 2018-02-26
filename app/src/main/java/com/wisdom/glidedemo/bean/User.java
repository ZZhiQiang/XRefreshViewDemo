package com.wisdom.glidedemo.bean;

/**
 * Created by 朱志强 on 2018/2/12.
 */

public class User {

    public String name;
    String age;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
