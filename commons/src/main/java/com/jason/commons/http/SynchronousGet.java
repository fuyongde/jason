package com.jason.commons.http;

import okhttp3.*;

import java.io.IOException;

/**
 * 该Java类用来演示如何使用OKHTTP的同步GET请求
 * Created by fuyongde on 16/4/4.
 */
public class SynchronousGet {

    private final OkHttpClient client = new OkHttpClient();

    /**
     * response中的string()方法,适合返回值比较小的时候采用(小于1MB),返回值较大时,推荐采用byteStream()或charStream()方法.
     * @throws IOException
     */
    private void run() throws IOException {
        Request request = new Request.Builder()
                .url("http://www.qq.com/")
                .build();

        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) {
            throw new IOException("Unexpected code " + response);
        }

        Headers responseHeaders = response.headers();
        for (int i = 0; i < responseHeaders.size(); i++) {
            System.out.println(responseHeaders.name(i) + ": " + responseHeaders.value(i));
        }

        System.out.println(response.body().string());
    }

    public static void main(String[] args) throws IOException {
        new SynchronousGet().run();
    }
}