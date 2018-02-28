package com.example.testmovie.message;

public class Message {
    public static int SUCCESS_CODE = 200;

    public static int NOT_FOUND_CODE = 400;

    private int code;

    public Message(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
