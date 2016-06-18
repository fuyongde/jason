package com.jason.commons.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by fuyongde on 16/6/18.
 */
public class IdCardUtils {

    enum IdCardPattern {
        IDCARD(""),
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
     * @param idCardNum 身份证号码
     * @return
     */
    public static boolean isIdCard(String idCardNum) {
        return isIdCard(idCardNum, IdCardPattern.IDCARD);
    }

    /**
     * 判断是否为身份证号码
     * @param idCardNum 身份号码
     * @param idCardPattern 正则表达式
     * @return
     */
    public static boolean isIdCard(String idCardNum, IdCardPattern idCardPattern) {
        Pattern pattern = Pattern.compile(idCardPattern.getPattern());
        Matcher matcher = pattern.matcher(idCardNum);
        return matcher.matches();
    }
}
