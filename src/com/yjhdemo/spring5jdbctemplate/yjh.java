package com.yjhdemo.spring5jdbctemplate;

public class yjh {
    private int id;
    private String name;
    private String sex;
    private String likename;

    public yjh() {
    }

    public yjh(int id, String name, String sex, String likename) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.likename = likename;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLikename() {
        return likename;
    }

    public void setLikename(String likename) {
        this.likename = likename;
    }
}
