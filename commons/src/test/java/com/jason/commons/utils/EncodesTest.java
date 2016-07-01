package com.jason.commons.utils;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

/**
 * Encodes Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>7 1, 2016</pre>
 */
public class EncodesTest {

    Logger logger = LoggerFactory.getLogger(EncodesTest.class);

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
     * Method: encodeHex(byte[] input)
     */
    @Test
    public void testEncodeHex() throws Exception {
        String hex = Encodes.encodeHex("fuyongde".getBytes("UTF-8"));
        assertEquals("Fail", "6675796f6e676465", hex);
    }

    /**
     * Method: decodeHex(String input)
     */
    @Test
    public void testDecodeHex() throws Exception {
        byte[] ret = Encodes.decodeHex("6675796f6e676465");
        String result = new String(ret);
        assertEquals("Fail", "fuyongde", result);
    }

    /**
     * Method: encodeBase64(byte[] input)
     */
    @Test
    public void testEncodeBase64() throws Exception {
        String bs = Encodes.encodeBase64("fuyongde".getBytes("UTF-8"));
        assertEquals("Fail", "ZnV5b25nZGU=", bs);
    }

    /**
     * Method: decodeBase64(String input)
     */
    @Test
    public void testDecodeBase64() throws Exception {
        byte[] ret = Encodes.decodeBase64("ZnV5b25nZGU=");
        String result = new String(ret);
        assertEquals("Fail", "fuyongde", result);
    }

    /**
     * Method: encodeBase64URLSafe(byte[] input)
     */
    @Test
    public void testEncodeBase64URLSafe() throws Exception {
        String bs = Encodes.encodeBase64URLSafe("https://www.google.com/".getBytes("UTF-8"));
        assertEquals("Fail", "aHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8", bs);
    }

    /**
     * Method: encodeBase62(byte[] input)
     */
    @Test
    public void testEncodeBase62() throws Exception {
        String bs2 = Encodes.encodeBase62("https://www.google.com/".getBytes("UTF-8"));
        System.out.println(bs2);
    }

    /**
     * Method: encodeURL(String part)
     */
    @Test
    public void testEncodeURL() throws Exception {
        String url = Encodes.encodeURL("https://www.google.com/");
        assertEquals("Fail", "https%3A%2F%2Fwww.google.com%2F", url);
    }

    /**
     * Method: decodeURL(String part)
     */
    @Test
    public void testDecodeURL() throws Exception {
        String url = Encodes.decodeURL("https%3A%2F%2Fwww.google.com%2F");
        assertEquals("Fail", "https://www.google.com/", url);
    }


} 
