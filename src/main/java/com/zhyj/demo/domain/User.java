package com.zhyj.demo.domain;

import java.io.Serializable;

public class User implements Serializable{
    private String userName;
    private String passWord;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getUserName() {
        return userName;
    }
}
