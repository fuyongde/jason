package com.jason.commons.utils;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * Created by fuyongde on 2015/10/30.
 */
public class Encodes {

    private static final String DEFAULT_URL_ENCODING = "UTF-8";
    private static final char[] BASE62 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();

    /**
     * Hex编码
     *
     * @param input
     * @return
     */
    public static String encodeHex(byte[] input) {
        return Hex.encodeHexString(input);
    }

    /**
     * Hex解码
     *
     * @param input
     * @return
     * @throws DecoderException
     */
    public static byte[] decodeHex(String input) throws DecoderException {
        return Hex.decodeHex(input.toCharArray());
    }

    /**
     * Base64编码
     *
     * @param input
     * @return
     */
    public static String encodeBase64(byte[] input) {
        return Base64.encodeBase64String(input);
    }

    /**
     * Base64解码.
     *
     * @param input
     */
    public static byte[] decodeBase64(String input) {
        return Base64.decodeBase64(input);
    }

    /**
     * Base64编码, URL安全(将Base64中的URL非法字符'+'和'/'转为'-'和'_', 见RFC3548).
     *
     * @param input
     * @return
     */
    public static String encodeBase64URLSafe(byte[] input) {
        return Base64.encodeBase64URLSafeString(input);
    }

    /**
     * Base62编码
     *
     * @param input
     * @return
     */
    public static String encodeBase62(byte[] input) {
        char[] chars = new char[input.length];
        for (int i = 0; i < input.length; i++) {
            chars[i] = BASE62[(input[i] & 0xFF) % BASE62.length];
        }
        return new String(chars);
    }

    /**
     * URL编码，默认字符集为UTF-8
     *
     * @param part
     * @return
     * @throws UnsupportedEncodingException
     */
    public static String encodeURL(String part) throws UnsupportedEncodingException {
        return URLEncoder.encode(part, DEFAULT_URL_ENCODING);
    }

    /**
     * URL解码，默认字符集为UTF-8
     *
     * @param part
     * @return
     * @throws UnsupportedEncodingException
     */
    public static String decodeURL(String part) throws UnsupportedEncodingException {
        return URLDecoder.decode(part, DEFAULT_URL_ENCODING);
    }
}