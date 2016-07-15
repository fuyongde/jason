package com.jason.showcase.algorithm;

/**
 * 该程序演示斐波那契数列相关的问题
 * Created by fuyongde on 16/3/27.
 */
public class Fibonacci {

    /**
     * 递归算法实现
     * @param n
     * @return
     */
    public int func1(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return func1(n - 1) + func1(n - 2);
        }
    }

    /**
     * 递推算法实现
     * @param n
     * @return
     */
    public int func2(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int n0 = 0;
            int n1 = 1;
            int ns = 0;
            for (int i = 0; i <= n-2; i++) {
                ns = n0 + n1;
                n0 = n1;
                n1 = ns;
            }
            return ns;
        }
    }
}
