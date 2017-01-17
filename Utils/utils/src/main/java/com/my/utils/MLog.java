package com.my.utils;

import android.util.Log;

/**
 * @author kun.zhang
 * @version 9.0.0
 *          17/1/17 17:27
 */

public class MLog {
    private static boolean mLogEnable;

    public static void setEnable(boolean isEnable) {
        mLogEnable = isEnable;
    }

    public static void d(String tag, String content) {
        if (!mLogEnable) {
            return;
        }
        Log.d(tag, content);
    }

    public static void w(String tag, String content) {
        if (!mLogEnable) {
            return;
        }
        Log.w(tag, content);
    }

    public static void e(String tag, String content) {
        if (!mLogEnable) {
            return;
        }
        Log.e(tag, content);
    }
}
