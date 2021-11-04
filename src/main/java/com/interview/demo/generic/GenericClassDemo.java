package com.interview.demo.generic;

// 泛型类
public class GenericClassDemo<T> {

    private T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }
}
