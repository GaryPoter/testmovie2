package com.example.testmovie.utils;

import java.util.Date;

public class ConditionalObj {
    private String table;

    private String name;

    private String col;

    private Date date;

    public ConditionalObj() {
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public ConditionalObj(String table, String col, String name, Date date) {
        this.table = table;
        this.name = name;
        this.date = date;
        this.col = col;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
