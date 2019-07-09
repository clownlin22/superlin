package com.example.jichudemo.controller;

/**
 * @Author: lxy
 * @Date: 2019/7/8 16:09
 */
public class aa {
    private String a_num = "aa";
    private static String a_num2 = "aa2";
    static {
        System.out.println("aa静态代码块"+a_num2);
    }
    {
        System.out.println("aa非静态代码块");
    }

    public aa() {
        System.out.println("aa构造");
    }
}

class bb extends aa {
    private String b_num = "bb";
    private static String b_num2 = "bb2";
    static {
        System.out.println("bb静态代码块");
    }
    {
        System.out.println("bb非静态代码块");
    }

    public bb() {
        System.out.println("bb构造");
    }

    public static void main(String[] args) {
        bb b=new bb();
    }
}
