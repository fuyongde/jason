package com.jason;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String[] atp = {"Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer",
                "Andy Murray", "Tomas Berdych", "Juan Martin Del Potro"};
        List<String> players = Arrays.asList(atp);

        System.out.println("\n旧的循环模式：");
        // 以前的循环方式
        for (String player : players) {
            System.out.print(player + "; ");
        }
        System.out.println("\nlambda 表达式：");
        // 使用 lambda 表达式以及函数操作(functional operation)
        players.forEach((player) -> System.out.print(player + "; "));
        System.out.println("\nJava8 中使用双冒号操作符：");
        // 在 Java 8 中使用双冒号操作符(double colon operator)
        players.forEach(System.out::print);

        String s = "1";

    }


}
