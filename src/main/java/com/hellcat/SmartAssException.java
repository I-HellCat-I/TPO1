package com.hellcat;

public class SmartAssException extends RuntimeException {
    public SmartAssException(String message) {
        super(message);
    }
    public SmartAssException() {
        super("Maybe you should not use absolute precision");
    }
}
