package com.framework.lvyerose.eventclosetest;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

public class MainActivityFinal extends BaseActivity {
    private static final String TAG = "MainActivityFinal";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_final);
    }

    public void closeMe(View view) {
        EventBus.getDefault().post(MainActivityFinal.class);
    }

    public void closeA(View view) {
        EventBus.getDefault().post(MainActivity.class);
    }

    public void closeB(View view) {
        EventBus.getDefault().post(MainActivityB.class);
    }

    public void closeC(View view) {
        EventBus.getDefault().post(MainActivityC.class);
    }

    public void closeD(View view) {
        EventBus.getDefault().post(MainActivityD.class);
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, TAG + "--关闭了");
        super.onDestroy();
    }
}
