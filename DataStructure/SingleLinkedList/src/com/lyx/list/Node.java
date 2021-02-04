package com.lyx.list;

public class Node {
    private String data;
    private Node nextNode;

    public Node() {
    }

    public Node(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        if (nextNode!=null){
            return "Node{" +
                    "data='" + data + '\'' +
                    ", nextNode=" + nextNode.getData() +
                    '}';
        }
        return "Node{" +
                "data='" + data + '\'' +
                ", nextNode=" + nextNode +
                '}';
    }
}
