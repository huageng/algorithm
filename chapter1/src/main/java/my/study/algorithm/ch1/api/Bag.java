package my.study.algorithm.ch1.api;

import java.util.Iterator;

/**
 * @author： huageng
 * @Date: 2019/1/6 17:13
 * @Description: 背包数据结构 API定义，背包是一种不支持从中删除元素的集合数据类型，他的目的就是帮助用例收集元素，
 *      并遍历所有收集到的元素。迭代的顺序不确定且与用例无关。
 */
public class Bag<Item> implements Iterable<Item> {

    /**
     * 创建一个空背包
     */
    public Bag() {
    }

    /**
     * 添加一个元素
     *
     * @param item
     */
    public void add(Item item) {

    }

    /**
     * 背包是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 背包中元素的数量
     *
     * @return
     */
    public int size() {
        return 0;
    }

    public Iterator<Item> iterator() {
        return null;
    }

}
