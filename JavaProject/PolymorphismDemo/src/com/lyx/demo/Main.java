package com.lyx.demo;

public class Main {
    public static void main(String[] args) {
        System.out.println("======================多态=====================");
        Rabbit rabbit = new Rabbit("小白");
        showEat(rabbit);
        Bear bear = new Bear("熊二");
        showEat(bear);
    }

    public static void showEat(Animal animal){
        /*其实这里就是一种多态向上转型应用的实例
        * 通过对Animal animal传入不同的子类实例应用多态的特性
        * 即等同于向上转型Animal animal = rabbit;
        *               Animal animal = bear;
        * 之后通过多态中的成员方法口诀：编译看左边，运行看右边。
        * 便可理解下行代码：实际调用运行了rabbit和bear的eat()方法*/
        System.out.println(animal.getClass());
        animal.eat();
    }
}
