package com.xzh.aidldemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by zhihong on 2016/8/3.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
      findViewById(R.id.aidl_test).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        PushClient.getInstance().connect();
    }
}
