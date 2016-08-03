package com.xzh.aidldemo;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/**
 * Created by zhihong on 2016/8/3.
 */
public class PushClient {
    private IHandler iHandler;
    private static PushClient instance = new PushClient();

    public static PushClient getInstance() {
        return instance;
    }

    public void init(Application app){
        Intent binderIntent = new Intent(app,PushService.class);
        app.bindService(binderIntent, serviceConnection, Context.BIND_AUTO_CREATE);
    }

    private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            iHandler = IHandler.Stub.asInterface(service);
            //连接成功调用
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            //断开连接调用
        }
    };

    //通过AIDL远程调用
    public void connect(){
        try {
            iHandler.connect();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
