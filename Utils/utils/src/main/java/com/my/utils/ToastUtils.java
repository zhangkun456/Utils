package com.my.utils;

import android.widget.Toast;

/**
 * @author kun.zhang
 * @version 9.0.0
 *          17/1/17 18:00
 */

public class ToastUtils {
    private static Toast mToast;

    public static void showToast(String message) {
        if (!StringUtils.isEmpty(message)) {
            if (mToast == null) {
                mToast = Toast.makeText(ContextUtils.getContext(), "", 1);
            }


            mToast.setText(message);
            mToast.show();
        }
    }
}
