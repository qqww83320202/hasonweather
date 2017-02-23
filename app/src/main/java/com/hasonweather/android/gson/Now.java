package com.hasonweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yhx11 on 2017/2/23.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More {
        @SerializedName("txt")
        public String info;
    }
}
