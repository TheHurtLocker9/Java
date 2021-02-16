package com.lyx.demo;

/**
 * 泛型在接口中使用的第二种方式：
 * 实现类为接口声明泛型类型
 * 在接口的抽象方法中使用的泛型类型也随之被声明为该类型。
 */
public class GenericityImp2 implements GenericityInterFace<String> {
    @Override
    public void method1(String s) {
        System.out.println(s);
    }
}
