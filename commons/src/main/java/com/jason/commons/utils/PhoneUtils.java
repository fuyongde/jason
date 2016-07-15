package com.jason.commons.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by fuyongde on 16/6/18.
 */
public class PhoneUtils {

    enum PhoneNumberPattern {
        MOBILE("^((13[0-9])|(15[^4,\\D])|(18[0-9]))\\d{8}$"),
        TELEPHONE("");

        String pattern;

        PhoneNumberPattern(String pattern) {
            this.pattern = pattern;
        }

        public String getPattern() {
            return pattern;
        }

    }

    /**
     * 判断是否为手机号码
     *
     * @param phoneNum 手机号码
     * @return
     */
    public static boolean isMobile(String phoneNum) {
        return isPhoneNum(phoneNum, PhoneNumberPattern.MOBILE);
    }

    /**
     * 判断是否为电话号码
     *
     * @param phoneNum           电话号码
     * @param phoneNumberPattern 电话号码匹配规则
     * @return
     */
    public static boolean isPhoneNum(String phoneNum, PhoneNumberPattern phoneNumberPattern) {
        Pattern pattern = Pattern.compile(phoneNumberPattern.getPattern());
        Matcher matcher = pattern.matcher(phoneNum);
        return matcher.matches();
    }
}
