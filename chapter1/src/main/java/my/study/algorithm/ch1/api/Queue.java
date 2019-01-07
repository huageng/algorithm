package my.study.algorithm.ch1.api;

import java.util.Iterator;

/**
 * @author： huageng
 * @Date: 2019/1/6 17:20
 * @Description: 先进先出（FIFO）队列
 */
public class Queue<Item> implements Iterable<Item> {

    /**
     * 创建空队列
     */
    public Queue() {
    }

    /**
     * 添加一个元素
     *
     * @param item
     */
    public void enqueue(Item item) {

    }

    /**
     * 删除最早添加的元素
     *
     * @return
     */
    public Item dequeue() {
        return null;
    }

    /**
     * 队列是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 队列中元素的数量
     *
     * @return
     */
    public int size() {
        return 0;
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }
}
