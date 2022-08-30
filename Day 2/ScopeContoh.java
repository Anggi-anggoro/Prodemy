package com.prodemy.h2;

public class ScopeContoh {
    private int a = 1;
    public void firstMethod() {
        int a = 4, b =5;
        this.a = a + b;
        secondMethod(7);
    }
    public void secondMethod(int a) {
        int b = 8;
        this.a=  a + b;

    }
}
