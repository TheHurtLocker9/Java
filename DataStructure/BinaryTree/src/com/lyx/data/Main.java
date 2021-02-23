package com.lyx.data;

public class Main {
    public static void main(String[] args) {
//        ABDG##H###CE#I##F##
//        前序遍历输出：A B D G H C E I F
//        中序遍历输出：G D H B A E I C F
//        后序遍历输出：G H D B I E F C A
        System.out.println("请输入前序扩展序列以创建二叉树：");
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.printBinaryTree();
        System.out.println();
        System.out.println(binaryTree.preSelect('F')+":"+binaryTree.getCount());
        System.out.println(binaryTree.inSelect('F')+":"+binaryTree.getCount());
        System.out.println(binaryTree.postSelect('F')+":"+binaryTree.getCount());
    }
}
