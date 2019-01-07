package my.study.algorithm.ch1.ex;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import my.study.algorithm.ch1.api.Stack;

/**
 * @author： huageng
 * @Date: 2019/1/7 21:16
 * @Description:
 */
public class Reverse {

    /**
     * 下压栈：在应用程序中
     * @param args
     */
    public static void main(String[] args) {
        Stack<Integer> stack;
        stack = new Stack<Integer>();
        while (!StdIn.isFinished("#")) {
            stack.push(StdIn.readInt());
        }

        for (int i : stack) {
            StdOut.println(i);
        }
    }
}
