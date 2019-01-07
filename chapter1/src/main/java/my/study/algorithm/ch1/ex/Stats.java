package my.study.algorithm.ch1.ex;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import my.study.algorithm.ch1.api.Bag;
import my.study.algorithm.ch1.api.Queue;

/**
 * @author： huageng
 * @Date: 2019/1/6 18:19
 * @Description:
 */
public class Stats {

    public static void main(String[] args) {
        testBag();
    }

    /**
     * Bag 的一个典型用例：
     * 计算标准输入中的所有 double 值的平均值和样本标准差：
     * 如果标准输入中有 N 个数字，那么平均值为它们的和除以 N，样本标准差为每个值与平均值之差的平方之和
     * 除以 N-1 之和的平方根。
     * 在这些计算中，输的计算结果和顺序无关，因此我们将它们保存在一个 Bag 中
     */
    public static void testBag() {
        Bag<Double> numbers = new Bag<Double>();
        System.out.println("begin:");
        while (!StdIn.isFinished("#")) {
            double v = StdIn.readDouble();
            System.out.println(v);
            numbers.add(v);
        }
        System.out.println("end:");
        int N = numbers.size();

        double sum = 0.0;
        for (double x : numbers) {
            sum += x;
        }

        double mean = sum / N;

        sum = 0.0;
        for (double x : numbers) {
            sum += (x - mean) * (x - mean);
        }
        double std = Math.sqrt(sum / (N - 1));

        StdOut.printf("Mean: %.2f\n", mean);
        StdOut.printf("Std dev: %.2f\n", std);
    }

    /**
     * 队列的应用
     *
     * @param name
     * @return
     */
    public static int[] readInts(String name) {
        In in = new In(name);
        Queue<Integer> q = new Queue<Integer>();
        while (!in.isEmpty()) {
            q.enqueue(in.readInt());
        }
        int N = q.size();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = q.dequeue();
        }
        return a;
    }


}