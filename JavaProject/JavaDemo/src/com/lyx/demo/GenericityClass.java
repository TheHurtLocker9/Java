package com.lyx.demo;

/**
 * 自定义泛型类
 */
public class GenericityClass<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public <M> void GenericityMethod(M m){
        System.out.println(m.getClass()+":"+m);
    }
}
