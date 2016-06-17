package com.jason.commons.date;

/**
 * 时间处理的工具
 * Created by fuyongde on 16/4/10.
 */
public enum DateFormaterEmun {

    pattern1("yyyy-MM-dd HH:mm:ss"),
    pattern2("yyyy/MM/dd HH:mm:ss"),
    pattern3("yyyy年MM月dd日 HH:mm:ss"),

    pattern4("yyyyMMddHHmmss"),

    pattern5("yyyy-MM-dd HH:mm"),
    pattern6("yyyy/MM/dd HH:mm"),

    pattern7("yyyy-MM-dd"),
    pattern8("yyyy/MM/dd"),
    pattern9("yyyyMMdd");

    String pattern;

    DateFormaterEmun(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
