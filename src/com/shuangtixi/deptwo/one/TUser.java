package com.shuangtixi.deptwo.one;

public class TUser {
    private String userName;
    private String userPassword;

    public TUser() {}

    public TUser(String userName, String userPassword) {
        super();
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}


