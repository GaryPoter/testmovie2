package com.example.testmovie.DAO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
    public static final String ID = "id";

    public static final String NAME = "name";

    public static final String PASWD = "paswd";

    @NotNull
    private Long id;

    @NotNull
//    @Size(min = 5, max = 20)
    private String name;

    @NotNull
//    @Size(min = 8, max = 20)
    private String paswd;

    public User(Long id, String name, String paswd) {
        this.id = id;
        this.name = name;
        this.paswd = paswd;
    }

    public User(String name, String paswd) {
        this.id = new Long(-1);
        this.name = name;
        this.paswd = paswd;
    }

    //jackson对象的转换需要默认构造函数
    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaswd() {
        return paswd;
    }

    public void setPaswd(String paswd) {
        this.paswd = paswd;
    }
}
