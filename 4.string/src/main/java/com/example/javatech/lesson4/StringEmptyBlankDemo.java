package com.example.javatech.lesson4;

import org.apache.commons.lang3.StringUtils;

/**
 * Java实用技术课程 By Pandas。
 *
 * @author Pandas
 * @date 2021/9/12
 */
public class StringEmptyBlankDemo {

    /**
     * 判断字符串为空？
     * 超过一半程序员不知道用哪个好！
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "";
        String s3 ="    \t\r\n "; // 应该用哪个方法？

        System.out.println("s1 == null --> " + (s1 == null));
        System.out.println("s2.isEmpty() --> " + s2.isEmpty());
        System.out.println("s3.isEmpty() --> " + s3.isEmpty());
        System.out.println("s2 == null || s2.isEmpty() --> " + (s2 == null || s2.isEmpty()));

        System.out.println("=====================");
        // StringUtils -> isEmpty, isBlank
        System.out.println("StringUtils.isEmpty --> " + StringUtils.isEmpty(s3));
        System.out.println("StringUtils.isBlank --> " + StringUtils.isBlank(s3));
    }
}
