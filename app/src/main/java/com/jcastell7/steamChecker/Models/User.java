package com.jcastell7.steamChecker.Models;

public class User {

    private String name;
    private String user_id;
    private String device_id;

    public User(String name, String user_id, String  device_id) {
        this.name = name;
        this.user_id = user_id;
        this.device_id = device_id;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setDevice_id(String device_id){
        this.device_id = device_id;
    }

    @Override
    public String toString() {
        return "{" + name +":"+ device_id + '}';
    }
}

