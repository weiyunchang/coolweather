package com.example.hasee.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by HASEE on 2017/9/1.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
