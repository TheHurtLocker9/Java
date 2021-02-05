package com.lyx.list;

import java.util.Arrays;

/**
 * 以数组为容器，顺序存储的线性表。
 * 因为数组容量不可变，注意添加扩容和删除紧缩。
 * 1.添加元素（增）
 * 2.在指定索引处插入元素（增）
 * 3.根据索引删除元素（删）
 * 4.根据索引修改元素（改）
 * 5.查找指定元素是否存在。（查）
 * 6.返回元素下标（查）
 * 7.根据索引查询元素（查）
 */
public class SequentialLists {
    private Object[] list;//数组容器
    private int size;//元素计数器
    private int capacity;//容量

    public SequentialLists() {
        size = 0;
        capacity = 10;
        list = new Object[capacity];
    }

    public SequentialLists(int capacity) {
        size = 0;
        this.capacity = capacity;
        list = new Object[capacity];
    }

    /**
     * 1.添加元素（增）
     *
     * @param obj 元素
     */
    public void add(Object obj) {
        //判断扩容
        isFull();
        list[size++] = obj;
    }

    /**
     * 2.在指定索引处插入元素（增）
     *
     * @param index 指定索引
     * @param obj   元素
     */
    public void insert(int index, Object obj) {
        //判断扩容
        isFull();
        //验证索引
        if (index < 0 || index > size) {
            System.out.println("指定插入索引错误");
            return;
        }
        //移动元素
        for (int i = 0; i < size - index; i++) {
            list[size - i] = list[size - i - 1];
        }
        //插入元素
        list[index] = obj;
        size++;
    }

    /**
     * 3.根据索引删除元素（删）
     *
     * @param index 指定索引
     */
    public void delete(int index) {
        //验证索引
        if (index < 0 || index > size - 1) {
            System.out.println("指定删除索引错误");
            return;
        }
        //移动元素覆盖
        for (int i = 0; i < size - index; i++) {
            list[index + i] = list[index + i + 1];
        }
        size--;
    }

    /**
     * 4.根据索引修改元素（改）
     *
     * @param index 指定索引
     * @param obj   新元素
     */
    public void updata(int index, Object obj) {
        //验证索引
        if (index < 0 || index > size - 1) {
            System.out.println("指定更新索引错误");
            return;
        }
        list[index] = obj;
    }

    /**
     * 5.查找指定元素是否存在。（查）
     *
     * @param obj 查询的元素
     * @return
     */
    public boolean isExist(Object obj) {
        //通过调用查询元素下标方法，判断其返回值实现
        return indexOf(obj) >= 0;
    }

    /**
     * 6.返回元素下标（查）
     *
     * @param obj 查询的元素
     * @return 返回查询到元素的索引 / 无此元素则返回-1
     */
    public int indexOf(Object obj) {
        for (int i = 0; i < size; i++) {
            if (list[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 7.根据索引查询元素（查）
     *
     * @param index 指定索引
     * @return
     */
    public Object dataAt(int index) {
        //验证索引
        if (index < 0 || index > size - 1) {
            System.out.println("指定查询索引错误");
            return null;
        }
        return list[index];
    }

    /**
     * 封装工具方法：判断容量是否达上限需要扩容。
     *
     * @return T已扩容 / F未达上限
     */
    private boolean isFull() {
        if (size == capacity) {
            capacity = capacity + 5;
            Object[] newList = new Object[capacity];
            for (int i = 0; i < list.length; i++) {
                newList[i] = list[i];
            }
            list = newList;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "SequentialLists{" +
                "list=" + Arrays.toString(list) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
