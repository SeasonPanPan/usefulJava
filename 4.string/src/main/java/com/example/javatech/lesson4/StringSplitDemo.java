package com.example.javatech.lesson4;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Java实用技术课程 By Pandas。
 *
 * @author Pandas
 * @date 2021/10/5
 */
public class StringSplitDemo {

    /**
     * 字符串拆分方法用哪个？
     */
    public static void main(String[] args) {
        String ss = "a.|b."; // 使用“|”拆分
        System.out.println("*** 原生 String.split 方法 *****");
        if (StringUtils.isNotEmpty(ss)) {
            String[] s1 = ss.split("\\|");
            System.out.println(Arrays.toString(s1));
        }

        System.out.println("*** 原生 StringTokenizer 方法 *****");
        StringTokenizer tokenizer = new StringTokenizer(ss, "|");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }

        // "a.|b."
        System.out.println("*** StringUtils 方法 *****");
        String[] s2 = StringUtils.split(ss, ".");
        System.out.println(Arrays.toString(s2));

        String[] s3 = StringUtils.splitByWholeSeparator(ss, ".");
        System.out.println(Arrays.toString(s3));
        String[] s4 = StringUtils.splitPreserveAllTokens(ss, ".");
        System.out.println(Arrays.toString(s4));

    }

}
