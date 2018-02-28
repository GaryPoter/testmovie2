package com.example.testmovie.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class JDBCStatement {
    private Table table;

    public JDBCStatement() {
        this.table = new Table();
    }

    public JDBCStatement tableName(String tableName){
        table.setTableName(tableName);
        return this;
    }

    public JDBCStatement setCols(String[] cols){
        table.setCols(cols);
        return this;
    }

    public JDBCStatement setK(String[] k){
        table.setK(k);
        return this;
    }

    public JDBCStatement setV(String[] v){
        table.setV(v);
        return this;
    }
}

