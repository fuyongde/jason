package com.jason.commons.http;

import okhttp3.*;

import java.io.IOException;

/**
 * 该类演示如何使用OKHTTP的POST方法提交一段字符串到服务端
 * Created by fuyongde on 16/4/4.
 */
public class PostString {

    public static final MediaType MEDIA_TYPE_MARKDOWN = MediaType.parse("text/x-markdown; charset=utf-8");

    private final OkHttpClient client = new OkHttpClient();

    /**
     * 当字符串大于1MB时,不推荐采用此方法
     *
     * @throws Exception
     */
    public void run() throws Exception {
        String postBody = ""
                + "Releases\n"
                + "--------\n"
                + "\n"
                + " * _1.0_ May 6, 2013\n"
                + " * _1.1_ June 15, 2013\n"
                + " * _1.2_ August 11, 2013\n";

        Request request = new Request.Builder()
                .url("https://api.github.com/markdown/raw")
                .post(RequestBody.create(MEDIA_TYPE_MARKDOWN, postBody))
                .build();

        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) {
            throw new IOException("Unexpected code " + response);
        }

        System.out.println(response.body().string());
    }

    public static void main(String... args) throws Exception {
        new PostString().run();
    }

}