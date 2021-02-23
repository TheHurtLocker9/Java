package com.lyx.data;

import java.util.Scanner;

public class BinaryTree {
    public Node root;//根结点
    private String userIn = ""; //用户输入的扩展先序序列
    private int index = 0;//字符串读取指针
    private int count = 0;//查找计数器


    public BinaryTree() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            userIn = scanner.nextLine();
        }
        root = creatNode();
    }

    /**
     * 先序查找二叉树中的结点
     *
     * @param c 查找数据
     * @return 找到则返回该结点，否则返回null
     */
    public Node preSelect(char c) {
        if (root == null) {
            return null;
        }
        count = 0;
        return preFind(c, root);
    }

    /**
     * 中序查找二叉树中的结点
     *
     * @param c 查找数据
     * @return 找到则返回该结点，否则返回null
     */
    public Node inSelect(char c) {
        if (root == null) {
            return null;
        }
        count = 0;
        return inFind(c, root);
    }

    /**
     * 后序查找二叉树中的结点
     *
     * @param c 查找数据
     * @return 找到则返回该结点，否则返回null
     */
    public Node postSelect(char c) {
        if (root == null) {
            return null;
        }
        count = 0;
        return postFind(c, root);
    }

    /**
     * 打印输出二叉树
     */
    public void printBinaryTree() {
        System.out.print("前序遍历输出：");
        preOrder(root);
        System.out.print("\n中序遍历输出：");
        inOrder(root);
        System.out.print("\n后序遍历输出：");
        postOrder(root);
    }

    /**
     * 构造结点（存在递归）
     *
     * @return 返回构造完成的结点
     */
    private Node creatNode() {
        char c = userIn.charAt(index++);//读取数据
        if (c == '#') {
            return null;
        } else {
            Node node = new Node();//创建结点
            node.setData(c);//设置结点数据
            node.setLeftNode(creatNode());//设置左子树
            node.setRightNode(creatNode());//设置右子树
            return node;
        }
    }

    /**
     * 前序遍历算法(父-左-右)
     */
    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getData() + " ");
        preOrder(node.getLeftNode());
        preOrder(node.getRightNode());
    }

    /**
     * 中序遍历算法(左-父-右)
     */
    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.getLeftNode());
        System.out.print(node.getData() + " ");
        inOrder(node.getRightNode());
    }

    /**
     * 后序遍历算法(左-右-父)
     */
    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.getLeftNode());
        postOrder(node.getRightNode());
        System.out.print(node.getData() + " ");
    }

    /**
     * 先序查找结点
     *
     * @param c    结点数据
     * @param node 查找的结点
     * @return 找到则返回该结点，否则返回null
     */
    private Node preFind(char c, Node node) {
        count++;
        if (node.getData().equals(c)) {
            return node;
        }
        Node n = null;
        if (node.getLeftNode() != null) {
            n = preFind(c, node.getLeftNode());
            if (n != null) {
                return n;
            }
        }
        if (node.getRightNode() != null) {
            n = preFind(c, node.getRightNode());
            if (n != null) {
                return n;
            }
        }
        return n;
    }

    /**
     * 中序查找结点
     *
     * @param c    结点数据
     * @param node 查找的结点
     * @return 找到则返回该结点，否则返回null
     */
    private Node inFind(char c, Node node) {
        Node n = null;
        if (node.getLeftNode() != null) {
            n = preFind(c, node.getLeftNode());
            if (n != null) {
                return n;
            }
        }
        count++;
        if (node.getData().equals(c)) {
            return node;
        }
        if (node.getRightNode() != null) {
            n = preFind(c, node.getRightNode());
            if (n != null) {
                return n;
            }
        }
        return n;
    }

    /**
     * 后序查找结点
     *
     * @param c    结点数据
     * @param node 查找的结点
     * @return 找到则返回该结点，否则返回null
     */
    private Node postFind(char c, Node node) {
        Node n = null;
        if (node.getLeftNode() != null) {
            n = preFind(c, node.getLeftNode());
            if (n != null) {
                return n;
            }
        }
        if (node.getRightNode() != null) {
            n = preFind(c, node.getRightNode());
            if (n != null) {
                return n;
            }
        }
        count++;
        if (node.getData().equals(c)) {
            return node;
        }
        return n;
    }


    public int getCount() {
        return count;
    }

}
