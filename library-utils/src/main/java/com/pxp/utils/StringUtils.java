package com.pxp.utils;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

    //隐藏手机号
    public static String hidePhone(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 11) {
            return str;
        }
        return str.substring(0, 3) + "****" + str.substring(7, str.length());
    }

    //隐藏邮箱
    public static String hideEmail(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 4) return str;
        return str.substring(0, 1) + "***" + str.substring(4, str.length());
    }

    /**
     * 密码检查
     * 8-12为数字字母组成
     */
    public static boolean isPassword(String str) {
        String regExp = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,20}$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(str);
        return m.matches();
    }

    /**
     * 手机号检查
     */
    public static boolean isPhone(String str) {
        String regExp = "^(13[0-9]|14[01456879]|15[0-35-9]|16[2567]|17[0-8]|18[0-9]|19[0-35-9])\\d{8}$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(str);
        return m.matches();
    }

    /**
     * 邮箱检查
     */
    public static boolean isEmail(String str) {
        String regExp = "^([A-Za-z0-9_\\-\\.])+\\@([A-Za-z0-9_\\-\\.])+\\.([A-Za-z]{2,4})$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(str);
        return m.matches();
    }

    /**
     * 去除空行
     */
    public static String wipeOffEmptyLine(String text){
        return text.replaceAll("\\n{2,}","\n");
    }

}
