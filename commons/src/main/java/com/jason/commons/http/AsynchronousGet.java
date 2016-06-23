package com.jason.commons.http;

import okhttp3.*;

import java.io.IOException;

/**
 * 该类演示如何使用OKHTTP中的异步GET请求
 * Created by fuyongde on 16/4/4.
 */
public class AsynchronousGet {

    private final OkHttpClient client = new OkHttpClient();

    /**
     * 在一个线程中去发送一个HTTP请求,读取响应时会阻塞当前线程.OKHTTP目前不提供异步的API来接受response
     *
     * @throws Exception
     */
    public void run() throws Exception {
        Request request = new Request.Builder()
                .url("http://www.qq.com/")
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (!response.isSuccessful()) {
                    throw new IOException("Unexpected code " + response);
                }

                Headers responseHeaders = response.headers();
                for (int i = 0, size = responseHeaders.size(); i < size; i++) {
                    System.out.println(responseHeaders.name(i) + ": " + responseHeaders.value(i));
                }

                System.out.println(response.body().string());
            }
        });
    }

    public static void main(String... args) throws Exception {
        new AsynchronousGet().run();
    }
}