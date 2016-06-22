package com.jason.commons.utils;

import com.jason.commons.date.DateFormaterEmun;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
        BIRTHADY("\\d{6}(\\d{4})(\\d{2})(\\d{2}).*"),
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
    public static Date getBirthday(String idCardNum) throws ParseException {
        Pattern birthdayPattern = Pattern.compile(IdCardPattern.BIRTHADY.getPattern());
        Matcher birthdayMather = birthdayPattern.matcher(idCardNum);
        StringBuffer dateStr = new StringBuffer();
        if (birthdayMather.find()) {
            String yearStr = birthdayMather.group(1);
            String monthStr = birthdayMather.group(2);
            String dayStr = birthdayMather.group(3);
            dateStr.append(yearStr).append(monthStr).append(dayStr);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateFormaterEmun.pattern9.getPattern());
            return simpleDateFormat.parse(dateStr.toString());
        } else {
            return null;
        }
    }

    /**
     * 获取身份证号码中的年份
     * @param idCardNum 身份证号码
     * @return
     */
    public static int getBirthdayYear(String idCardNum) {
        Pattern birthdayPattern = Pattern.compile(IdCardPattern.BIRTHADY.getPattern());
        Matcher birthdayMather = birthdayPattern.matcher(idCardNum);
        if (birthdayMather.find()) {
            String yearStr = birthdayMather.group(1);
            return Integer.valueOf(yearStr);
        } else {
            return 0;
        }
    }

    /**
     * 获取身份证号码中的月份
     * @param idCardNum 身份证号码
     * @return
     */
    public static int getBirthdayMonth(String idCardNum) {
        Pattern birthdayPattern = Pattern.compile(IdCardPattern.BIRTHADY.getPattern());
        Matcher birthdayMather = birthdayPattern.matcher(idCardNum);
        if (birthdayMather.find()) {
            String monthStr = birthdayMather.group(2);
            return Integer.valueOf(monthStr);
        } else {
            return 0;
        }
    }

    /**
     * 获取身份证号码中的天
     * @param idCardNum 身份证号码
     * @return
     */
    public static int getBirthdayDayofMonth(String idCardNum) {
        Pattern birthdayPattern = Pattern.compile(IdCardPattern.BIRTHADY.getPattern());
        Matcher birthdayMather = birthdayPattern.matcher(idCardNum);
        if (birthdayMather.find()) {
            String day = birthdayMather.group(3);
            return Integer.valueOf(day);
        } else {
            return 0;
        }
    }
}
