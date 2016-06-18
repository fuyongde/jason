package com.jason.commons.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by fuyongde on 16/6/18.
 */
public class PhoneUtils {

    enum PhoneNumberPattern{
        MOBILE("^[1]([3][0-9]{1}|59|58|88|89|85|83)[0-9]{8}$"),
        TELEPHONE("");

        String pattern;

        PhoneNumberPattern(String pattern) {
            this.pattern = pattern;
        }

        public String getPattern() {
            return pattern;
        }

        public void setPattern(String pattern) {
            this.pattern = pattern;
        }
    }

    public static boolean isMobile(String phone) {
        Pattern pattern = Pattern.compile(PhoneNumberPattern.MOBILE.getPattern());
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }
}
