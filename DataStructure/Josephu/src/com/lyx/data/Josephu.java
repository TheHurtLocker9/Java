package com.lyx.data;

import java.util.ArrayList;

public class Josephu {
    private Node<?> first;//头指针
    private Node<?> rear;//尾指针

    /**
     * 初始化创建单向环形链表
     *
     * @param e   首个结点数据
     * @param <E> 数据泛型
     */
    public <E> Josephu(E e) {
        Node<E> head = new Node<>(e);
        //自己指向自己形成闭环
        head.setNextNode(head);
        first = head;
        rear = head;
    }

    /**
     * 新建一个结点
     *
     * @param e   结点数据
     * @param <E> 数据泛型
     */
    public <E> void add(E e) {
        if (first==null){
            Node<E> head = new Node<>(e);
            //自己指向自己形成闭环
            head.setNextNode(head);
            first = head;
            rear = head;
            return;
        }
        //创建新结点
        Node<E> newNode = new Node<>(e);
        //新结点的后指针指向first头结点
        newNode.setNextNode(first);
        //尾结点的后指针指向新结点
        rear.setNextNode(newNode);
        //尾指针后移
        rear = rear.getNextNode();
    }

    /**
     * 遍历输出单向循环链表
     */
    public void printList() {
        if (first==null){
            System.out.println("当前链表为空！");
            return;
        }
        Node<?> sub = first;
        System.out.println("--------------开始输出--------------");
        do {
            System.out.println(sub);
            sub = sub.getNextNode();
        } while (sub != first);
        System.out.println("--------------结束输出--------------");
    }

    /**
     *
     * @param data 指定的开始计数结点数据
     * @param num 计数数量
     * @param <E> 数据泛型
     */
    public <E> ArrayList<Node<?>> josephuOut(E data,int num){
        ArrayList<Node<?>> arrayList = new ArrayList<>();//出队集合
        Node<?> sub = first.getNextNode();//遍历用临时结点指针
        Node<?> userNode = null;//指定的开始计数结点指针
        Node<?> userFrontNode = null;//指定的开始计数结点的前结点指针
        //判断指定结点是否是头结点
        if (sub.getData().equals(first.getData())){
            userNode =first;
            userFrontNode = rear;
        }
        //若不是头结点则找出该指定结点,从第二个结点开始遍历
        do {
            if (sub.getNextNode().getData().equals(data)){
                userNode = sub.getNextNode();
                userFrontNode = sub;
                break;
            }
            sub = sub.getNextNode();
        } while (sub != first);
        //如果没找到则输出提示
        if (userNode==null){
            System.out.println("未找到用户所指定的开始结点。");
            return null;
        }
        while (true){
            //根据指定计数开始移动指定结点指针
            for (int i = 0; i < num-1; i++) {
                userNode = userNode.getNextNode();
                userFrontNode = userFrontNode.getNextNode();
                System.out.println("准备出队结点为："+userNode);
                System.out.println("准备出队结点的前结点为："+userFrontNode);
            }
            //将出队结点加入集合
            arrayList.add(userNode);
            //删除该出队结点
            userFrontNode.setNextNode(userNode.getNextNode());
            //更新出队指针
            userNode = userFrontNode.getNextNode();
            if (userFrontNode==userNode){
                arrayList.add(userNode);
                first=null;
                rear = null;
                System.out.println("已出队完毕，当前链表为空");
                break;
            }
        }
        return arrayList;
    }
}
