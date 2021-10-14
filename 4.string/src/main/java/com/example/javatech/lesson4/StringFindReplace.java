package com.example.javatech.lesson4;

import org.apache.commons.lang3.RegExUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * the StringFindReplace
 *
 * @author Pandas
 * @date 2021/10/13
 */
public class StringFindReplace {

    /**
     * 4.4 字符串查找和替换用什么方法好？
     */
    public static void main(String[] args) {
        String ss = "a.b.c";

        int indexOf1 = ss.indexOf(".");
        System.out.println("'.' index = " + indexOf1); // 1

        String s11 = ss.replace(".", "|");
        System.out.println(s11);
        String s12 = ss.replaceAll(".", "|"); // ?
        System.out.println(s12);

        String s21 = StringUtils.replace(ss, ".", "|");
        System.out.println(s21);
        String s211 = StringUtils.replaceOnce(ss, ".", "|");
        System.out.println(s211);

        // 废弃方法，不推荐
        String s22 = StringUtils.replaceAll(ss, ".", "|");
        System.out.println(s22);
        String s221 = RegExUtils.replaceAll(ss, "\\.", "|");
        System.out.println(s221);

    }
}
