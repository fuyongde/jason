package com.jason.showcase.java8;

/**
 * Created by Qinjianf on 2016/7/20.
 */
public class LambdaExp {

    public static void main(String[] args) {
        Converter<String, Integer> converter = from -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);
    }
}

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}