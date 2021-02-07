package com.lyx.list;

/**
 * 双向链表
 * 1.在链表尾部添加一个结点（增）
 * 2.在指定位置处后插一结点（增）
 * 3.删除指定位置处的结点（删）
 * 4.修改指定位置处的结点（改）
 * 5.查询是否存在某元素结点（查）
 * 6.输出某元素的位置（查）
 * 7.输出链表
 */
public class DoubleLinkedList {
    Node head;
    int size;

    public DoubleLinkedList() {
        head = new Node();
        size = 0;
    }

    /**
     * 1.在链表尾部添加一个结点（增）
     *
     * @param data 新节点的数据
     */
    public void add(Object data) {
        Node temp = head;
        while (true) {
            if (temp.getNextNode() == null) {
                break;
            }
            temp = temp.getNextNode();
        }
        Node newNode = new Node(data);
        temp.setNextNode(newNode);
        newNode.setPreNode(temp);
        size++;
    }

    /**
     * 2.在指定位置处后插一结点（增）
     *
     * @param index 位置索引
     */
    public void insert(int index, Object data) {
        if (index < 0 || index > size) {
            throw new RuntimeException("Err:插入位置索引越界");
        }
        Node temp = head;
        //找到指定结点
        for (int i = 0; i < index; i++) {
            temp = temp.getNextNode();
        }
        Node newNode = new Node(data);
        //修改新结点后一结点的前指针
        if (temp.getNextNode() != null) {
            temp.getNextNode().setPreNode(newNode);
        }
        //修改新结点的后指针
        newNode.setNextNode(temp.getNextNode());
        //修改新结点的前指针
        newNode.setPreNode(temp);
        //修改新结点前一结点的后指针
        temp.setNextNode(newNode);
        size++;
    }

    /**
     * 3.删除指定位置处的结点（删）
     *
     * @param index 位置索引
     */
    public void delete(int index) {
        if (index < 1 || index > size) {
            throw new RuntimeException("Err:删除位置索引越界");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNextNode();
        }
        //令被删除结点的前结点的后指针 指向 被删除结点的后结点
        temp.getPreNode().setNextNode(temp.getNextNode());
        //令被删除结点的后结点的前指针 指向 被删除结点的前结点
        if (temp.getNextNode() != null) {
            temp.getNextNode().setPreNode(temp.getPreNode());
        }
        size--;
    }

    /**
     * 4.修改指定位置处的结点（改）
     *
     * @param index 位置索引
     * @param data  更新数据
     */
    public void updata(int index, Object data) {
        if (index < 1 || index > size) {
            throw new RuntimeException("Err:更新位置索引越界");
        }
        delete(index);
        insert(index - 1, data);
    }

    /**
     * 5.查询是否存在某元素结点（查）
     * @param data 查询的数据
     * @return T存在/F不存在
     */
    public boolean isExist(Object data){
        if (select(data)>0){
            return true;
        }
        return false;
    }

    /**
     * 6.输出某元素的位置（查）
     * @param data 查询的数据
     * @return 返回数据的位置 / -1 无此数据
     */
    public int select(Object data){
        int index = 1;
        Node temp = head.getNextNode();
        while (true){
            if (temp == null){
                index = -1;
                break;
            }
            if (temp.getData().equals(data)){
                break;
            }
            index++;
            temp = temp.getNextNode();
        }
        return index;
    }


    /**
     * 7.输出链表
     */
    public void showList() {
        System.out.println("-----------双线链表开始-----------");
        Node temp = head.getNextNode();
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp.toString());
            temp = temp.getNextNode();
        }
        System.out.println("-----------双线链表结束-----------");
    }

}
