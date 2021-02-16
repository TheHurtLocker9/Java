package com.lyx.demo;

/**
 * StringBuilder 字符串缓冲区
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder builder1 = new StringBuilder();
        //String -> StringBuilder
        StringBuilder builder2 = new StringBuilder("TEST");
        //StringBuilder -> String
//        String builderStr = builder2.toString();
        builder2.append("追加");
        System.out.println(builder1);
        System.out.println(builder2);
    }
}
