package com.lyx.demo;

/**
 * 泛型在接口中实现的第一种方式：
 * 即实现类保留接口的泛型类型，在实现类对象被创建时再声明泛型类型。
 * @param <I>
 */
public class GenericityImp1<I> implements GenericityInterFace<I> {
    @Override
    public void method1(I i) {
        System.out.println(i);
    }
}
