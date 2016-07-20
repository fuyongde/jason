package com.jason;

import com.google.common.collect.Lists;
import com.sun.org.apache.xpath.internal.operations.String;

import java.util.List;

/**
 * Created by Qinjianf on 2016/7/12.
 */
public class Fibonacci {

    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    /**
     * 递归算法实现
     * @param n
     * @return
     */
    public int func1(int n) {
        count ++;
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

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.func1(10);
        System.out.println(fibonacci.getCount());
        List<String> list = Lists.newArrayList();
        list.contains("a");
    }
}
