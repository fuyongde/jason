package com.jason.showcase.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Qinjianf on 2016/7/19.
 */
public class LambdaApp {
    public static void main(String[] args) {
        old();
        new1();
        new2();
        new3();
        new4();
        int a = 1, b = 3;
        int c = a = b;
        System.out.println(c);
    }

    public static void old(){
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void new1() {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, (String a, String b)-> {
            return b.compareTo(a);
        });
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void new2() {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, (String a, String b)-> b.compareTo(a));
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void new3() {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, (a, b)-> b.compareTo(a));
        names.forEach((name)-> System.out.println(name));
    }

    public static void new4() {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, (a, b)-> b.compareTo(a));
        names.forEach(System.out::println);
    }
}
