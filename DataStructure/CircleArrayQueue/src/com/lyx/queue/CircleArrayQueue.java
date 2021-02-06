package com.lyx.queue;

/**
 * 以数组为容器顺序存储的列队。
 * 1.入队（增）
 * 2.出队（删）
 * 3.查询队列中是否存在某元素（查）
 * 4.打印队列
 */
public class CircleArrayQueue {
    private Object[] queue;//队列容器
    private int maxsize;//容量
    private int front;//队首指针
    private int rear;//队尾指针

    public CircleArrayQueue() {
        maxsize = 5;
        queue = new Object[maxsize];
        front = 0;
        rear = 0;
    }

    public CircleArrayQueue(int maxsize) {
        this.maxsize = maxsize;
        queue = new Object[maxsize];
        front = 0;
        rear = 0;
    }

    /**
     * 1.入队（增）
     *
     * @param data 新增数据
     */
    public void add(Object data) {
        //队列判满
        if ((rear + 1) % maxsize == front) {
            System.out.println("不能继续插入数据，队列已满。");
            return;
        }
        queue[rear++] = data;
    }

    /**
     * 2.出队（删）
     *
     * @return
     */
    public Object get(){
        if (rear == front){
            throw new RuntimeException("Err:队列为空");
        }
        return queue[front++];
    }

    /**
     * 3.查询队列中是否存在某元素（查）
     * @param data 查询的数据
     * @return 元素下标 / -1不存在
     */
    public int isExist(Object data){
        for (int i = front; i < rear; i++) {
            if (queue[i].equals(data)){
                return i;
            }
        }
        return -1;
    }

    /**
     * 4.打印队列
     */
    public void showQueue(){
        System.out.print("[");
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i]+"\t");
        }
        System.out.print("]");
    }
}
