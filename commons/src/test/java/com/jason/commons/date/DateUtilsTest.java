package com.jason.commons.date;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DateUtils Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>四月 17, 2016</pre>
 */
public class DateUtilsTest {

    private Date start1;
    private Date start2;
    private Date start3;
    private Date start4;
    private Date end;

    @Before
    public void before() throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String start1Str = "2015-04-17 17:33:20 123";
        String start2Str = "2015-04-17 17:32:33 123";
        String start3Str = "2015-04-17 16:33:33 123";
        String start4Str = "2015-04-16 17:33:33 123";
        String    endStr = "2015-04-17 17:33:33 567";

        start1 = simpleDateFormat.parse(start1Str);
        start2 = simpleDateFormat.parse(start2Str);
        start3 = simpleDateFormat.parse(start3Str);
        start4 = simpleDateFormat.parse(start4Str);
        end = simpleDateFormat.parse(endStr);
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: poorSecond(Date start, Date end)
     */
    @Test
    public void testPoorSecondForStartEnd() throws Exception {
        assertEquals(13.44d, DateUtils.poorSecond(start1, end), 0d);
    }

    /**
     * Method: poorSecond(Date start, Date end, int precision)
     * ¬
     */
    @Test
    public void testPoorSecondForStartEndPrecision() throws Exception {
        assertEquals(13.444d, DateUtils.poorSecond(start1, end, 3), 0d);
    }

    /**
     * Method: poorMinute(Date start, Date end)
     */
    @Test
    public void testPoorMinuteForStartEnd() throws Exception {
        assertEquals(1.01d, DateUtils.poorMinute(start2, end), 0d);
    }

    /**
     * Method: poorMinute(Date start, Date end, int precision)
     */
    @Test
    public void testPoorMinuteForStartEndPrecision() throws Exception {
        assertEquals(1.007d, DateUtils.poorMinute(start2, end, 3), 0d);
    }

    /**
     * Method: poorHour(Date start, Date end)
     */
    @Test
    public void testPoorHourForStartEnd() throws Exception {
        assertEquals(1.00d, DateUtils.poorHour(start3, end), 0d);
    }

    /**
     * Method: poorHour(Date start, Date end, int precision)
     */
    @Test
    public void testPoorHourForStartEndPrecision() throws Exception {
        assertEquals(1.000d, DateUtils.poorHour(start3, end, 3), 0d);
    }

    /**
     * Method: poorDay(Date start, Date end)
     */
    @Test
    public void testPoorDayForStartEnd() throws Exception {
        assertEquals(1.00d, DateUtils.poorDay(start4, end), 0d);
    }

    /**
     * Method: poorDay(Date start, Date end, int precision)
     */
    @Test
    public void testPoorDayForStartEndPrecision() throws Exception {
        assertEquals(1.000d, DateUtils.poorDay(start4, end, 3), 0d);
    }

} 
