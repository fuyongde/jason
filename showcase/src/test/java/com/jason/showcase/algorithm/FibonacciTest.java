package com.jason.showcase.algorithm;

import com.jason.commons.date.DateUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

/**
 * Fibonacci Tester.
 *
 * @author fuyongde
 * @version 1.0
 * @since <pre>七月 2, 2016</pre>
 */
public class FibonacciTest {

    private static Logger logger = LoggerFactory.getLogger(FibonacciTest.class);

    private Long start, end = null;

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
     * Method: func1(int n)
     */
    @Test
    public void testFunc1() throws Exception {
        Fibonacci fibonacci = new Fibonacci();
        StringBuffer sb = new StringBuffer();
        sb.append(fibonacci.func1(0)).append(",");
        sb.append(fibonacci.func1(1)).append(",");
        sb.append(fibonacci.func1(2)).append(",");
        sb.append(fibonacci.func1(3)).append(",");
        sb.append(fibonacci.func1(4)).append(",");
        sb.append(fibonacci.func1(5)).append(",");
        sb.append(fibonacci.func1(6)).append(",");
        sb.append(fibonacci.func1(7));
        String result = "0,1,1,2,3,5,8,13";
        assertEquals("Fail", sb.toString(), result);
    }

    /**
     * Method: func2(int n)
     */
    @Test
    public void testFunc2() throws Exception {
        Fibonacci fibonacci = new Fibonacci();
        StringBuffer sb = new StringBuffer();
        sb.append(fibonacci.func2(0)).append(",");
        sb.append(fibonacci.func2(1)).append(",");
        sb.append(fibonacci.func2(2)).append(",");
        sb.append(fibonacci.func2(3)).append(",");
        sb.append(fibonacci.func2(4)).append(",");
        sb.append(fibonacci.func2(5)).append(",");
        sb.append(fibonacci.func2(6)).append(",");
        sb.append(fibonacci.func2(7));
        String result = "0,1,1,2,3,5,8,13";
        assertEquals("Fail", sb.toString(), result);
    }


} 
