package my.study.algorithm.ch1.ex;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import my.study.algorithm.ch1.api.Stack;

/**
 * @author： huageng
 * @Date: 2019/1/7 21:29
 * @Description: 表达式求值, 处理步骤如下：
 * 将操作数压入操作数栈
 * 将运算符压入运算符栈
 * 忽略左括号
 * 在遇到右括号时，弹出一个运算符，弹出所需数量的操作数，并将运算符和操作数的运算结果压入操作数栈
 * 处理完最后一个右括号之后，操作数栈上只会有一个值，它就是表达式的值
 */
public class Evaluate {

    public static void main(String[] args) {

        //运算符符栈
        Stack<String> ops = new Stack<String>();
        //操作数栈
        Stack<Double> vals = new Stack<Double>();

        while (!StdIn.isFinished("#")) {
            String s = StdIn.readString();
            if ("(".equals(s))
                ;
            else if ("+".equals(s))
                ops.push(s);
            else if ("-".equals(s))
                ops.push(s);
            else if ("*".equals(s))
                ops.push(s);
            else if ("/".equals(s))
                ops.push(s);
            else if ("sqrt".equals(s))
                ops.push(s);
            else if (")".equals(s)) {
                String op = ops.pop();
                double v = vals.pop();
                if ("+".equals(op))
                    v = vals.pop() + v;
                else if ("-".equals(op))
                    v = vals.pop() - v;
                else if ("*".equals(op))
                    v = vals.pop() * v;
                else if ("/".equals(op))
                    v = vals.pop() / v;
                else if ("sqrt".equals(op))
                    v = Math.sqrt(v);
                vals.push(v);
            }
            else
                vals.push(Double.parseDouble(s));
        }
        StdOut.println(vals.pop());
    }

}
