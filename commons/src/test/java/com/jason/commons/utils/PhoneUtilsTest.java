package com.jason.commons.utils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

/**
 * PhoneUtils Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>六月 18, 2016</pre>
 */
public class PhoneUtilsTest {

    Logger logger = LoggerFactory.getLogger(PhoneUtilsTest.class);

    Long start, end = null;

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
     * Method: isMobile(String phone)
     */
    @Test
    public void testIsMobile() throws Exception {
        String phoneNum = "18538182601";
        String phoneNum2 = "1234567890";
        boolean b1 = PhoneUtils.isMobile(phoneNum);
        boolean b2 = PhoneUtils.isMobile(phoneNum2);
        assertEquals("Fail", true, b1);
        assertEquals("Fail", false, b2);
    }


} 
