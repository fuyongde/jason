package com.jason.commons.utils;

import com.jason.commons.date.DateUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

/**
 * RandomUtils Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>���� 30, 2016</pre>
 */
public class RandomUtilsTest {

    private static Logger logger = LoggerFactory.getLogger(RandomUtilsTest.class);

    private Long start = null;
    private Long end = null;

    @Before
    public void before() throws Exception {
        start = DateUtils.now();
    }

    @After
    public void after() throws Exception {
        end = DateUtils.now();
        logger.info("耗时{}毫秒", (end - start));
    }

    /**
     * Method: rollString()
     */
    @Test
    public void testRollString() throws Exception {
        String str = RandomUtils.rollString();
        assertEquals("Fail", 12, str.length());
    }


    /**
     * Method: rollInt(int min, int max)
     */
    @Test
    public void testRollInt() throws Exception {
        int i = RandomUtils.rollInt(1000, 10000);
        logger.info("{}", i);
    }

} 
