// IMyAidlInterface.aidl
package com.xzh.aidldemo;

// Declare any non-default types here with import statements

interface IHandler {
  void connect();
  void sendMessage(in Message message);
}
