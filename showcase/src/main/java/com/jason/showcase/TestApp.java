package com.jason.showcase;

/**
 * Created by Qinjianf on 2016/7/22.
 */
public class TestApp {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void test() {
        String name = this.name;
        if (name == null) {
            this.name = name = "A";
            System.out.println("成员变量 name ：" + this.name);
            System.out.println("局部变量 name ：" + name);
        }
    }

    public static void main(String[] args) {
        new TestApp().test();
    }
}
