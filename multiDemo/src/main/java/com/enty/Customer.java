package com.enty;

import java.io.Serializable;

public class Customer implements Serializable {
    private static final Long serialVersionUID = 1L;

    Integer id;
    String username;
    String pwd;

    public static Long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
