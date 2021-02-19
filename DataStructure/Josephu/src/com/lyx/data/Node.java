package com.lyx.data;

public class Node<E> {
    private E data;
    private Node<?> nextNode;

    public Node() {
    }

    public Node(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<?> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<?> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", nextNode=" + nextNode.getData() +
                '}';
    }
}
