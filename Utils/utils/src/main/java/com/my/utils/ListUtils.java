package com.my.utils;

import java.util.List;

/**
 * @author kun.zhang
 * @version 9.0.0
 *          17/1/17 17:59
 */

public class ListUtils {
    public static boolean isEmpty(List list) {
        return list != null && list.size() > 0;
    }
}
