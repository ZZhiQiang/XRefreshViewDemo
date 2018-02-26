package com.wisdom.glidedemo;

import android.app.Application;

/**
 * Created by 朱志强 on 2018/2/9.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(this);
    }
}
