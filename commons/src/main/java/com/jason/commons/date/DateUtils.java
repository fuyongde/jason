package com.jason.commons.date;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

/**
 * Created by fuyongde on 16/4/13.
 */
public class DateUtils {

    /**
     * Number of milliseconds in a standard second.
     */
    public static final double MILLIS_PER_SECOND = 1000.0d;
    /**
     * Number of milliseconds in a standard minute.
     */
    public static final double MILLIS_PER_MINUTE = 60 * MILLIS_PER_SECOND;
    /**
     * Number of milliseconds in a standard hour.
     */
    public static final double MILLIS_PER_HOUR = 60 * MILLIS_PER_MINUTE;
    /**
     * Number of milliseconds in a standard day.
     */
    public static final double MILLIS_PER_DAY = 24 * MILLIS_PER_HOUR;

    /**
     * 默认精度为2
     **/
    private static int PRECISION_DEFAULT = 2;

    public enum Type {
        SECOND(MILLIS_PER_SECOND),
        MINUTE(MILLIS_PER_MINUTE),
        HOUR(MILLIS_PER_HOUR),
        DAY(MILLIS_PER_DAY);
        double millis;

        Type(double millis) {
            this.millis = millis;
        }
    }

    /**
     * 获取当前的毫秒数
     * @return
     */
    public static long now() {
        return System.currentTimeMillis();
    }

    /**
     * 计算两个日期之差
     *
     * @param start
     * @param end
     * @param type
     * @return
     */
    public static double poor(Date start, Date end, Type type, int precision) {
        if (start.after(end)) {
            return 0;
        }

        long poor = end.getTime() - start.getTime();
        double d = poor / type.millis;
        BigDecimal b = new BigDecimal(d);
        //当精度低于0时,默认精度为0
        precision = precision < 0 ? 0 : precision;
        return b.setScale(precision, RoundingMode.HALF_UP).doubleValue();

    }

    /**
     * 计算两个日期相差的秒数
     *
     * @param start 开始时间
     * @param end   结束时间
     * @return
     */
    public static double poorSecond(Date start, Date end) {
        return poor(start, end, Type.SECOND, PRECISION_DEFAULT);
    }

    /**
     * 计算两个日期相差的秒数
     *
     * @param start     开始时间
     * @param end       结束时间
     * @param precision 精度
     * @return
     */
    public static double poorSecond(Date start, Date end, int precision) {
        return poor(start, end, Type.SECOND, precision);
    }

    /**
     * 计算两个日期相差的分钟
     *
     * @param start 开始时间
     * @param end   结束时间
     * @return
     */
    public static double poorMinute(Date start, Date end) {
        return poor(start, end, Type.MINUTE, PRECISION_DEFAULT);
    }

    /**
     * 计算两个日期相差的分钟
     *
     * @param start     开始时间
     * @param end       结束时间
     * @param precision 精度
     * @return
     */
    public static double poorMinute(Date start, Date end, int precision) {
        return poor(start, end, Type.MINUTE, precision);
    }

    /**
     * 计算两个日期相差的小时
     *
     * @param start 开始时间
     * @param end   结束时间
     * @return
     */
    public static double poorHour(Date start, Date end) {
        return poor(start, end, Type.HOUR, PRECISION_DEFAULT);
    }

    /**
     * 计算两个日期相差的小时
     *
     * @param start     开始时间
     * @param end       结束时间
     * @param precision 精度
     * @return
     */
    public static double poorHour(Date start, Date end, int precision) {
        return poor(start, end, Type.HOUR, precision);
    }

    /**
     * 计算两个日期相差的天数
     *
     * @param start 开始时间
     * @param end   结束时间
     * @return
     */
    public static double poorDay(Date start, Date end) {
        return poor(start, end, Type.DAY, PRECISION_DEFAULT);
    }

    /**
     * 计算两个日期相差的天数
     *
     * @param start     开始时间
     * @param end       结束时间
     * @param precision 精度
     * @return
     */
    public static double poorDay(Date start, Date end, int precision) {
        return poor(start, end, Type.DAY, precision);
    }
}
