package com.jason.showcase.java8;

/**
 * Created by Qinjianf on 2016/7/20.
 */
public class LambdaExp {

    public static void main(String[] args) {
        Converter<String, Integer> converter = from -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);

        Something something = new Something();
        Converter<String, String> converter1 = something::startWith;
        String s1 = converter1.convert("Java");
        System.out.println(s1);
    }
}

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}

class Something {

    String startWith(String s) {
        return String.valueOf(s.charAt(0));
    }
}