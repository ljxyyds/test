package com.need;

import java.util.Arrays;

public class BubblingSort2 {
    /**
     * 1。给出一个数组
     * 2.调用函数输出
     * @param args
     */
    public static void main(String[] args) {
        //自动装配
        int[] num={1,4,7,2,3,5,8,6,9};
        //int[] num=new int[]{1,4,7,2,3,5,8,6,9};
        //int temp=0;
//        for (int i = 0; i < num.length-1; i++) {
//            for (int j = 0; j < num.length-1-i; j++) {
//                if (num[j]>num[j+1]){
//                   int temp=num[j];
//                    num[j]=num[j+1];
//                    num[j+1]=temp;
//                }
//            }
//        }
        System.out.println("排序前"+Arrays.toString(num));
        //调用函数进行排序
        BubblingSort2(num);
        System.out.println("排序后"+Arrays.toString(num));
    }

    /**
     * 1.方法中传入一个数组
     * 2.对数组进行遍历
     * 3.调换数组中元素的位置
     * @param num
     */

    public static void BubblingSort2(int[] num){
        for (int i = 0; i < num.length-1; i++) {
            for (int j = 0; j < num.length-1-i; j++) {
                if (num[j]>num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
    }
}
