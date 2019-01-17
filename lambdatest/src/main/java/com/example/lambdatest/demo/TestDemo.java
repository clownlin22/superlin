package com.example.lambdatest.demo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author: lxy
 * @Date: 2019/1/15 23:25
 */

//class MyMoney{
//    private final int money;
//    public MyMoney(int money){
//        this.money=money;
//    }
//    public void printMoney(Function<Integer,String> moneyFormat){
//        System.out.println("我的存款："+moneyFormat.apply(this.money));
//    }
//}

public class TestDemo {

    public static void main(String[] args) {

        /**
         *   1
         */
        //int[] nums={33,22,55,21,99,68,48};
        ////parallel()并行
        //int min= IntStream.of(nums).parallel().min().getAsInt();
        //System.out.println(min);

        /**
         * 2
         */
        //new Thread(new Runnable() {
        //    @Override
        //    public void run() {
        //        System.out.println("ok");
        //    }
        //}).start();
        //
        //new Thread(() -> System.out.println("ok")).start();
        //Runnable run=() -> System.out.println("ok");
        //new Thread(run).start();

        /**
         * 3
         */
        //MyMoney me = new MyMoney(1111);
        //Function<Integer,String> moneyformat =
        //        i -> new DecimalFormat("#,###").format(i);
        //
        //me.printMoney(moneyformat.andThen(s -> "人民币" + s));

        /**
         * 4
         */
        //int[] nums={1,2,3};
        //int sum1 = IntStream.of(nums).sum();
        ////map中间操作
        ////sum终止操作
        //int sum2 = IntStream.of(nums).map(i->i*2).sum();

        /**
         * 5
         */
        Integer[] nums1={1,3,2};
        int[] nums2={1,3,2};
        List<Integer> ints =new ArrayList<>(Arrays.asList(nums1));
        ints.forEach(i -> System.out.println(i));
        List<Integer> resultList = new ArrayList<>(nums2.length);
        Collections.addAll(resultList,nums1);



    }
}
