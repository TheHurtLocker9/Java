package com.lyx.list;

/*
    单链表：头指针为空白节点，依靠指针单项链接。(注意判断指针范围)
    实现功能：
    1.链表尾部增加新节点（增）
    2.在指定位置插入新节点（增）
    3.删除指定位置的节点（删）
    4.删除指定数据的节点（删）
    5.修改指定位置的节点（改）
    6.查找指定位置的节点数据（查）
    7.打印链表
    8.链表倒置
 */
public class Linked {
    private int size;
    private Node head;

    /**
     * 初始化链表
     */
    public Linked() {
        size = 0;
        head = new Node();
    }

    /**
     * 1.链表尾部增加新节点（增）
     *
     * @param node 新节点
     */
    public void add(Node node) {
        Node temp = head;
        //遍历查找尾节点后插入
        while (true) {
            if (temp.getNextNode() == null) {
                temp.setNextNode(node);
                size++;
                return;
            }
            temp = temp.getNextNode();
        }
    }

    /**
     * 2.在指定位置插入新节点（增）
     *
     * @param node  新节点
     * @param order 指定位置
     * @return
     */
    public boolean insertion(Node node, int order) {
        boolean b = false;
        Node temp = head;
        if (order > size || order < 0) {
            System.out.println("指定数据位置越界");
            return b;
        }

        //在找到指定的节点后插入
        for (int i = 0; i < order; i++) {
            temp = temp.getNextNode();
        }
        node.setNextNode(temp.getNextNode());
        temp.setNextNode(node);
        size++;
        return b = true;
    }

    /**
     * 3.删除指定位置的节点（删）
     *
     * @param order 指定位置
     * @return
     */
    public boolean remove(int order) {
        boolean b = false;
        Node temp = head;
        if (order > size || order < 1) {
            System.out.println("指定数据位置越界");
            return b;
        }
        for (int i = 0; i < order - 1; i++) {
            temp = temp.getNextNode();
        }
        temp.setNextNode(temp.getNextNode().getNextNode());
        size--;
        return b = true;
    }

    /**
     * 4.删除指定数据的节点（删）
     *
     * @param data 匹配删除的数据
     * @return
     */
    public void removeAll(String data) {
        Node temp = head;
        while (true) {
            if (temp.getNextNode() == null) {
                return;
            }
            if (temp.getNextNode().getData().equals(data)) {
                temp.setNextNode(temp.getNextNode().getNextNode());
                size--;
                continue;
            }
            temp = temp.getNextNode();
        }
    }

    /**
     * 5.修改指定位置的节点（改）
     *
     * @param node  新节点
     * @param order 指定位置
     * @return
     */
    public boolean updata(Node node, int order) {
        boolean b = false;
        Node temp = head;
        if (order > size || order < 1) {
            System.out.println("指定数据位置越界");
            return b;
        }
        //找到需要替换节点的前一个节点
        for (int i = 0; i < order - 1; i++) {
            temp = temp.getNextNode();
        }
        node.setNextNode(temp.getNextNode().getNextNode());
        temp.setNextNode(node);
        return b = true;
    }

    /**
     * 6.查找指定位置的节点数据（查）
     *
     * @param order 指定位置
     * @return
     */
    public boolean select(int order) {
        boolean b = false;
        Node temp = head;
        if (order > size || order < 1) {
            System.out.println("指定数据位置越界");
            return b;
        }
        for (int i = 0; i < order; i++) {
            temp = temp.getNextNode();
        }
        System.out.println("第" + order + "个节点的数据为：" + temp.getData());
        return b = true;
    }

    /**
     * 7.打印链表
     */
    public void showList() {
        System.out.println("------开始输出链表------");
        //判空
        if (head.getNextNode() == null) {
            System.out.println("------链表为空------");
            return;
        }
        //头节点为空，头结点的后一节点开始输出链表
        Node temp = head.getNextNode();
        while (true) {
            if (temp == null) {
                System.out.println("------链表打印完成------");
                return;
            }
            System.out.println(temp.toString());
            temp = temp.getNextNode();
        }
    }

    /**
     * 8.链表倒置
     */
    public void reverse() {
        //创建一个新的头结点
        Node reverseHead = new Node();
        //设置一个临时操作结点
        Node temp = head.getNextNode();
        while (temp != null) {
            //将操作结点从原链表中拆出
            head.setNextNode(temp.getNextNode());
            //向逆序链表中插入操作结点
            temp.setNextNode(reverseHead.getNextNode());
            reverseHead.setNextNode(temp);
            //操作下一个结点
            temp = head.getNextNode();
        }
        //将倒序后的链表接入回原链表
        head.setNextNode(reverseHead.getNextNode());
    }
}
