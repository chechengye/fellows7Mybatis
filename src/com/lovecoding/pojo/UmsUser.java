package com.lovecoding.pojo;

import java.io.Serializable;

/**
 * 使用Mybatis技术栈时，通常实体类存放目录，习惯使用pojo,dto
 */
public class UmsUser implements Serializable{
    private Integer id;
    private String name;
    private String username;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UmsUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

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
}
