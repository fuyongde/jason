package com.jason.showcase.java8;

/**
 * Created by fuyongde on 2016/7/19.
 */
public interface Formula {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
