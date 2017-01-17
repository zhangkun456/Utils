package com.my.utils;

import android.content.Context;

/**
 * @author kun.zhang
 * @version 9.0.0
 *          17/1/17 17:56
 */

public class ContextUtils {
    private static Context sContext;

    public ContextUtils() {
    }

    public static void setContext(Context context) {
        sContext = context;
    }

    public static Context getContext() {
        return sContext;
    }
}
