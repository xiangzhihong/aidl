package com.xzh.aidldemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by zhihong on 2016/8/3.
 */
public class PushService extends Service{

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new LibHandler() ;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }
}
