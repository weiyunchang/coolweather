package com.example.hasee.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HASEE on 2017/9/4.
 */

public class Basic {
    @SerializedName("city")
    public String cityname;
    @SerializedName("id")
    public String weatherId;

    public Update update;
    public  class Update{
        @SerializedName("loc")
        public String updatatime;
    }
}
