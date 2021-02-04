package com.lyx.list;

public class Main {
    public static void main(String[] args) {
        //初始化单链表
        Linked linked = new Linked();
        //插入四个数据
        linked.add(new Node("张三"));
        linked.add(new Node("李四"));
        linked.add(new Node("王五"));
        linked.add(new Node("赵六"));
//        linked.showList();
        //在第一个位置插入新节点
        linked.insertion(new Node("小黑"),0);
        linked.showList();
        //更新第二个节点
        linked.updata(new Node("小黑"),2);
        linked.showList();
        //查询第五个节点
        linked.select(5);
        //删除第五个节点
        linked.remove(5);
        linked.showList();
        //删除所有数据为“小黑”的节点
        linked.removeAll("小黑");
        linked.showList();
    }
}
