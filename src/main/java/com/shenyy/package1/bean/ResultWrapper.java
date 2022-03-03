package com.shenyy.package1.bean;

public class ResultWrapper<T> {
    private String code;
    private String message;
    private T result;

    public ResultWrapper() {
    }

    public String getCode() {
        return this.code;
    }

    public boolean isSuccese() {
        return this.code.equals("0") || this.code.equals("000000");
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getResult() {
        return this.result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
