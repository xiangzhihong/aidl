package com.xzh.aidldemo.base;

import android.app.Application;

import com.xzh.aidldemo.PushClient;

/**
 * Created by zhihong on 2016/8/3.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        PushClient.getInstance().init(this);
    }
}
