package com.my.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author kun.zhang
 * @version 9.0.0
 *          17/1/17 17:53
 */

public class DateUtils {
    public static final String getFormatTime(long millis) {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        return fmt.format(new Date(millis)).toString();
    }
}
