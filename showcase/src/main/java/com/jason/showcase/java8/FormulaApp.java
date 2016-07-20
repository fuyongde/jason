package com.jason.showcase.java8;

/**
 * Created by Qinjianf on 2016/7/19.
 */
public class FormulaApp {
    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a);
            }
        };

        double d1 = formula.calculate(100);
        double d2 = formula.sqrt(16);
        System.out.println(d1);
        System.out.println(d2);
    }
}
