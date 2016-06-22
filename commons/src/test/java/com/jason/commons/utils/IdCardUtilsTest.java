package com.jason.commons.utils;

import com.jason.commons.date.DateFormaterEmun;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * IdCardUtils Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>06 22, 2016</pre>
 */
public class IdCardUtilsTest {

    Logger logger = LoggerFactory.getLogger(IdCardUtilsTest.class);

    Long start, end = null;
    String idCardNum = "410184199006015618";

    @Before
    public void before() throws Exception {
        start = System.currentTimeMillis();
    }

    @After
    public void after() throws Exception {
        end = System.currentTimeMillis();
        logger.info("耗时{}毫秒", end - start);
    }

    /**
     * Method: isIdCard(String idCardNum)
     */
    @Test
    public void testIsIdCardNum() throws Exception {
        boolean b = IdCardUtils.isIdCard(idCardNum);
        assertEquals("Fail", true, b);
    }

    /**
     * Method: isSecondIdCard(String idCardNum)
     */
    @Test
    public void testIsSecondIdCard() throws Exception {
        boolean b = IdCardUtils.isIdCard(idCardNum);
        assertEquals("Fail", true, b);
    }

    /**
     * Method: getBirthdayYear(String idCardNum)
     */
    @Test
    public void testGetBirthdayYear() throws Exception {
        int year = IdCardUtils.getBirthdayYear(idCardNum);
        assertEquals("Fail", 1990, year);
    }

    /**
     * Method: getBirthdayMonth(String idCardNum)
     */
    @Test
    public void testGetBirthdayMonth() throws Exception {
        int month = IdCardUtils.getBirthdayMonth(idCardNum);
        assertEquals("Fail", 06, month);
    }

    /**
     * Method: getBirthdayDayofMonth(String idCardNum)
     */
    @Test
    public void testGetBirthdayDayofMonth() throws Exception {
        int day = IdCardUtils.getBirthdayDayofMonth(idCardNum);
        assertEquals("Fail", 01, day);
    }

    /**
     * Method: getPattern()
     */
    @Test
    public void testGetBirthday() throws Exception {
        Date date = IdCardUtils.getBirthday(idCardNum);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateFormaterEmun.pattern9.getPattern());
        Date myBirthday = simpleDateFormat.parse("19900601");
        assertEquals("Fail", date, myBirthday);
    }

}
