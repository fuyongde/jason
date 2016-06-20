package com.jason.commons.utils;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 身份证号码的工具类
 * Created by fuyongde on 16/6/18.
 */
public class IdCardUtils {

    enum IdCardPattern {
        ID_CARD_15("^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$"),
        ID_CARD_18("^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9]|X)$"),
        PASSPORT("");

        String pattern;

        IdCardPattern(String pattern) {
            this.pattern = pattern;
        }

        public String getPattern() {
            return pattern;
        }
    }

    /**
     * 判断是否为身份证号码
     *
     * @param idCardNum 身份证号码
     * @return
     */
    public static boolean isIdCard(String idCardNum) {
        return isIdCard(idCardNum, IdCardPattern.ID_CARD_18) || isIdCard(idCardNum, IdCardPattern.ID_CARD_15);
    }

    /**
     * 判断是否为二代身份证号码
     *
     * @param idCardNum 身份证号码
     * @return
     */
    public static boolean isSecondIdCard(String idCardNum) {
        return isIdCard(idCardNum, IdCardPattern.ID_CARD_18);
    }

    /**
     * 判断是否为身份证号码
     *
     * @param idCardNum     身份号码
     * @param idCardPattern 正则表达式
     * @return
     */
    public static boolean isIdCard(String idCardNum, IdCardPattern idCardPattern) {
        Pattern pattern = Pattern.compile(idCardPattern.getPattern());
        Matcher matcher = pattern.matcher(idCardNum);
        return matcher.matches();
    }

    /**
     * 获取身份证号码中的生日
     * @param idCardNum 身份证号码
     * @return
     */
    public static Date getBirthday(String idCardNum) {
        return new Date();
    }

    /**
     * 获取身份证号码中的年份
     * @param idCardNum 身份证号码
     * @return
     */
    public static int getBirthdayYear(String idCardNum) {
        return 0;
    }

    /**
     * 获取身份证号码中的月份
     * @param idCardNum 身份证号码
     * @return
     */
    public static int getBirthdayMonth(String idCardNum) {
        return 0;
    }

    /**
     * 获取身份证号码中的天
     * @param idCardNum 身份证号码
     * @return
     */
    public static int getBirthdayDayofMonth(String idCardNum) {
        return 0;
    }
}
