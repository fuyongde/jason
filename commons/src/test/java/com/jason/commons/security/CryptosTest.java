package com.jason.commons.security;

import com.jason.commons.date.DateUtils;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Cryptos Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>���� 30, 2016</pre>
 */
public class CryptosTest {

    private static Logger logger = LoggerFactory.getLogger(CryptosTest.class);
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
     * Method: hmacSha1(byte[] input, byte[] key)
     */
    @Test
    public void testHmacSha1() throws Exception {

    }

    /**
     * Method: isMacValid(byte[] expected, byte[] input, byte[] key)
     */
    @Test
    public void testIsMacValid() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: generateHmacSha1Key()
     */
    @Test
    public void testGenerateHmacSha1Key() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: aesEncrypt(byte[] input, byte[] key)
     */
    @Test
    public void testAesEncryptForInputKey() throws Exception {
        byte[] key = Cryptos.generateAesKey();
        String input = "foo message";

        byte[] encryptResult = Cryptos.aesEncrypt(input.getBytes("UTF-8"), key);
        String descryptResult = Cryptos.aesDecrypt(encryptResult, key);

        System.out.println(key);
        System.out.println(descryptResult);
    }

    /**
     * Method: aesEncrypt(byte[] input, byte[] key, byte[] iv)
     */
    @Test
    public void testAesEncryptForInputKeyIv() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: aesDecrypt(byte[] input, byte[] key)
     */
    @Test
    public void testAesDecryptForInputKey() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: aesDecrypt(byte[] input, byte[] key, byte[] iv)
     */
    @Test
    public void testAesDecryptForInputKeyIv() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: generateAesKey()
     */
    @Test
    public void testGenerateAesKey() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: generateAesKey(int keysize)
     */
    @Test
    public void testGenerateAesKeyKeysize() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: generateIV()
     */
    @Test
    public void testGenerateIV() throws Exception {
//TODO: Test goes here... 
    }


    /**
     * Method: aes(byte[] input, byte[] key, int mode)
     */
    @Test
    public void testAesForInputKeyMode() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = Cryptos.getClass().getMethod("aes", byte[].class, byte[].class, int.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

    /**
     * Method: aes(byte[] input, byte[] key, byte[] iv, int mode)
     */
    @Test
    public void testAesForInputKeyIvMode() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = Cryptos.getClass().getMethod("aes", byte[].class, byte[].class, byte[].class, int.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

} 
