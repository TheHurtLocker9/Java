package com.lyx.list;

public class Node {
    private Object data;
    private Node nextNode;
    private Node preNode;

    public Node() {
    }

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getPreNode() {
        return preNode;
    }

    public void setPreNode(Node preNode) {
        this.preNode = preNode;
    }

    @Override
    public String toString() {
        if (preNode==null){
            return "Node{" +
                    "preNode=" + preNode +
                    ", data=" + data +
                    ", nextNode=" + nextNode.getData() +
                    '}';
        }
        if (nextNode==null){
            return "Node{" +
                    "preNode=" + preNode.getData() +
                    ", data=" + data +
                    ", nextNode=" + nextNode +
                    '}';
        }
        return "Node{" +
                "preNode=" + preNode.getData() +
                ", data=" + data +
                ", nextNode=" + nextNode.getData() +
                '}';
    }
}
