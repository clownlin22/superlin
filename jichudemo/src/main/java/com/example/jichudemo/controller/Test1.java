package com.example.jichudemo.controller;

/**
 * @Author: lxy
 * @Date: 2019/7/3 16:29
 */
public class Test1 {
    public static Test1 t1 = new Test1("t1");//第1步
    public static int k = 0;
    public static Test1 t2 = new Test1("t2");//第2步
    public static int i = print("i");//第3步
    public static int n = 99;//第4步
    public int j = print("j");//第6步

    {
        print("构造");//第7步
    }

    static {
        print("静态");//第5步
    }

    public Test1(String str) {
        System.out.println((++k) + ":" + str + "  i=" + i + " n=" + n);
        ++i;
        ++n;
    }

    private static int print(String str) {
        System.out.println((++k) + ":" + str + "  i=" + i + " n=" + n);//1：j i=0 n=0
        ++n;
        return ++i;
    }

    public static void main(String[] args) {
        Test1 test = new Test1("init");//第8步
    }
}
