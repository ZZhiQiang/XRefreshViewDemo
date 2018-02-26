package com.wisdom.refreshview.utils;

import android.util.Log;

/**
 * Created by zzq on 2017/4/1.
 */

public class LogUtil {
    private static final boolean DEBUG = false;

    public static void i(String msg) {
        if (!DEBUG) return;
        Log.i("XRefreshLayout", msg);
    }
}
