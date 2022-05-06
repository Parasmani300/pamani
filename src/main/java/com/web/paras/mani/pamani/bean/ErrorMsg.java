package com.web.paras.mani.pamani.bean;

public class ErrorMsg {
    String err;
    String tableName;

    public ErrorMsg(String err, String tableName) {
        this.err = err;
        this.tableName = tableName;
    }

    public String getErr() {
        return err;
    }

    public void setErr(String err) {
        this.err = err;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
