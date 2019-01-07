package my.study.algorithm.ch1.api;

import java.util.Iterator;

/**
 * @author： huageng
 * @Date: 2019/1/6 17:24
 * @Description: 后进先出（LIFO）栈
 */
public class Stack<Item> implements Iterable<Item> {

    /**
     * 创建一个空栈
     */
    public Stack() {
    }

    /**
     * 添加一个元素
     *
     * @param item
     */
    public void push(Item item) {

    }

    /**
     * 删除最近添加的元素
     *
     * @return
     */
    public Item pop() {
        return null;
    }

    /**
     * 栈是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 栈中元素的数量
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
