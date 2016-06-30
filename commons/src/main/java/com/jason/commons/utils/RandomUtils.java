package com.jason.commons.utils;

import org.apache.commons.lang3.RandomStringUtils;

import java.security.SecureRandom;

/**
 * Created by fuyongde on 2016/6/23.
 */
public class RandomUtils {

    private static SecureRandom secureRandom = new SecureRandom();

    /**
     * 生成一个随机数
     * @param min 最小数
     * @param max 最大数
     * @return
     */
    public static int rollInt(int min, int max) {
        return secureRandom.nextInt(max) % (max - min + 1) + min;
    }

    /**
     * 生成一个12位长度的随机的字符串
     * @return
     */
    public static String rollString() {
        return RandomStringUtils.random(12, true, true);
    }
}
