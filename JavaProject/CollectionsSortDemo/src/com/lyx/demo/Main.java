package com.lyx.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //public static <T extends Comparable<? super T>> void sort(List<T> list)
        //通过自定义类型实现Comparable<T>接口的方式实现sort排序
        Person person1 = new Person("LYX",23);
        Person person2 = new Person("CXY",22);
        Person person3 = new Person("XXX",99);
        ArrayList<Person> list = new ArrayList<>();
        Collections.addAll(list,person1,person2,person3);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

//        public static <T> void sort(List<T> list, Comparator<? super T> c)
        //通过传入Comparator<T>比较器的方式实现sort排序
        Animal animal1 = new Animal("猫",3);
        Animal animal2 = new Animal("狗",1);
        Animal animal3 = new Animal("熊",23);
        ArrayList<Animal> animals = new ArrayList<>();
        Collections.addAll(animals,animal1,animal2,animal3);
        System.out.println(animals);
        //通过匿名内部类的方式实现Comparator<T>，创建比较器按照指定规则排序
        Collections.sort(animals, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                /*
                o1-o2 --> 升序
                o2-o1 --> 降序
                 */
                return o1.getAge()-o2.getAge();
            }
        });
        Collections.sort(animals, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                //多重排序
                int result = o1.getAge() - o2.getAge();
                //如果年龄相同，则毕竟名称首字母
                if (result==0){
                    return o1.getName().charAt(0)-o2.getName().charAt(0);
                }else {
                    return result;
                }
            }
        });
        System.out.println(animals);
    }
}
