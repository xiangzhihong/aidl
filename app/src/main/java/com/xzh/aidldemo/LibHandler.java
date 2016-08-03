package com.xzh.aidldemo;

import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;

public class LibHandler extends IHandler.Stub{

    @Override
    public void connect() throws RemoteException {
        Log.d("","connect()");
    }

    @Override
    public void sendMessage(Message message) throws RemoteException {

    }

    @Override
    public IBinder asBinder() {
        return null;
    }
}
