package com.example.javatech.lesson4;

import org.apache.commons.lang3.StringUtils;

/**
 * the StringSub
 *
 * @author Pandas
 * @date 2021/10/7
 */
public class StringSub {

    /**
     * 截取字符串方法用哪个？
     */
    public static void main(String[] args) {
        String ss = "java_pandas.jpg";

        System.out.println("*** String原生substring方法 ***");
        // 对下划线和句号之间内容截取
        if (ss != null) {
            String s1 = ss.substring(ss.indexOf("_") + 1, ss.indexOf("."));
            System.out.println(s1);
        }

        System.out.println("*** StringUtils 方法 *****");
        String s2 = StringUtils.substringBetween(ss, "_", ".");
        System.out.println(s2);
        // 获取文件后缀名
        String postfix = StringUtils.substringAfterLast(ss, ".");
        String prefix = StringUtils.substringBeforeLast(ss, ".");
        System.out.println(postfix);
        System.out.println(prefix);

    }
}
