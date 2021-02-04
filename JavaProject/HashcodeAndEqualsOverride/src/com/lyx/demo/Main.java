package com.lyx.demo;

public class Main {
    public static void main(String[] args) {
        HashcodeAndEqualsOverride obj1 = new HashcodeAndEqualsOverride("test1");
        HashcodeAndEqualsOverride obj2 = new HashcodeAndEqualsOverride("test1");
        HashcodeAndEqualsOverride obj3 = new HashcodeAndEqualsOverride("test2");
        System.out.println(obj1.equals(obj2));//T
        System.out.println(obj1.equals(obj3));//F
        System.out.println("=====================String==================");
        /*
         *在String中==比较的是内存地址，equals比较的是字符串的值
         */
        String a = "a";
        String b ="a";
        String c = new String("a");
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b==c);
    }

}
