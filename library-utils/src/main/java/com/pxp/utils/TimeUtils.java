package com.pxp.utils;

import java.util.Formatter;
import java.util.Locale;

public class TimeUtils {
    /**
     * 根据秒获取时长格式
     *
     * @param timeSec
     * @return
     */
    public static String stringForTime(int timeSec) {
        if (timeSec <= 0 || timeSec >= 24 * 60 * 60) {
            return "00:00";
        }
        int seconds = timeSec % 60;
        int minutes = (timeSec / 60) % 60;
        int hours = timeSec / 3600;
        StringBuilder stringBuilder = new StringBuilder();
        Formatter mFormatter = new Formatter(stringBuilder, Locale.getDefault());
        if (hours > 0) {
            return mFormatter.format("%d:%02d:%02d", hours, minutes, seconds).toString();
        } else {
            return mFormatter.format("%02d:%02d", minutes, seconds).toString();
        }
    }

    /**
     * 根据毫秒获取时长格式
     *
     * @param timeMs
     * @return
     */
    public static String stringForTimeByMs(Long timeMs) {
        if (timeMs <= 0 || timeMs >= 24 * 60 * 60 * 1000) {
            return "00:00";
        }
        Long totalSeconds = timeMs / 1000;
        Long seconds = totalSeconds % 60;
        Long minutes = (totalSeconds / 60) % 60;
        Long hours = totalSeconds / 3600;
        StringBuilder stringBuilder = new StringBuilder();
        Formatter mFormatter = new Formatter(stringBuilder, Locale.getDefault());
        if (hours > 0) {
            return mFormatter.format("%d:%02d:%02d", hours, minutes, seconds).toString();
        } else {
            return mFormatter.format("%02d:%02d", minutes, seconds).toString();
        }
    }
}
