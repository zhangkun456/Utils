package com.my.utils;

import android.util.DisplayMetrics;

/**
 * @author kun.zhang
 * @version 9.0.0
 *          17/1/17 17:55
 */

public class DisplayUtils {
    private static DisplayMetrics sDisplayMetrics = null;

    public static int dp2px(int dp) {
        initDisplayMetrices();
        return (int) ((float) dp * sDisplayMetrics.density + (dp > 0 ? 0.5F : -0.5F));
    }

    public static int px2dp(int px) {
        initDisplayMetrices();
        return (int) ((float) px / sDisplayMetrics.density + (px > 0 ? 0.5F : -0.5F));
    }

    private static void initDisplayMetrices() {
        if (sDisplayMetrics == null) {
            sDisplayMetrics = ContextUtils.getContext().getResources().getDisplayMetrics();
        }

    }
}
