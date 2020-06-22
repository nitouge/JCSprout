package com.crossoverjie.guava.bloom;

/**
 * @Description
 * @Author nitouge
 * @Date 2020/6/22 13:06
 */
public class Email {
    private String userName;
    private String domain;

    public Email(String userName, String domain) {
        this.userName = userName;
        this.domain = domain;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
