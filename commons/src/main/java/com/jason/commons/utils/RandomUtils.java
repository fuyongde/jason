package com.jason.commons.utils;

import java.util.Random;

/**
 * Created by fuyongde on 2016/6/23.
 */
public class RandomUtils {

    /**
     * 生成一个随机数
     * @param length 随机数长度
     * @return
     */
    private static String rollNum(int length) {
        Random rm = new Random();
        // 获得随机数
        double pross = (1 + rm.nextDouble()) * Math.pow(10, length);
        // 将获得的获得随机数转化为字符串
        String fixLenthString = String.valueOf(pross);
        // 返回固定的长度的随机数
        return fixLenthString.substring(1, length + 1);
    }

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(10000));

        Random rm = new Random();
        // 获得随机数
        double pross = (1 + rm.nextDouble()) * Math.pow(10, 4);

        System.out.println(pross);

//        for (int i = 0; i < 1000; i++) {
//            System.out.println(rollNum(4));
//        }
    }
}
