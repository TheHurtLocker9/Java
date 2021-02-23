package com.lyx.data;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Node {
    private Character data;
    private Node leftNode;
    private Node rightNode;

    public Node() {
    }

    public Character getData() {
        return data;
    }

    public void setData(Character data) {
        this.data = data;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        if (leftNode!=null&&rightNode!=null){
            return "Node{" +
                    "data=" + data +
                    ", leftNode=" + leftNode.getData() +
                    ", rightNode=" + rightNode.getData() +
                    '}';
        } else if (leftNode!=null) {
            return "Node{" +
                    "data=" + data +
                    ", leftNode=" + leftNode.getData() +
                    ", rightNode=" + null +
                    '}';
        }else if (rightNode!=null){
            return "Node{" +
                    "data=" + data +
                    ", leftNode=" + null +
                    ", rightNode=" + rightNode.getData() +
                    '}';
        }else {
            return "Node{" +
                    "data=" + data +
                    ", leftNode=" + null +
                    ", rightNode=" + null +
                    '}';
        }

    }
}
