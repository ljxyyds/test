package com.need;

import java.util.Arrays;
//快速排序算法
public class QuickSort2 {
//传入数组，两个参考数
public static int count;
    public QuickSort2(int[] num, int left, int right) {
        //判断元素个数是否为1，是则返回
        if(left>right){
            return;
        }
        //定义基准数
        int key=num[left];
        //比基准数小的放在左边
        int i=left;
        //比基准数大的放在右边
        int j=right;
        while(i<j){
            //向左移动直到一道比key小的数
            while(num[j]>=key&&i<j){
                j--;
            }
            //向右移动直到遇到比key大的数
            while(num[i]<=key&&i<j){
                i++;
            }
            //符合条件，对数值进行交换
            if (i<j){
                int temp=num[i];
                num[i]=num[j];
                num[j]=temp;
            }
        }
        //将基准数与i和j相等的位置进行交换
        num[left]=num[i];
        num[i]=key;
        count++;
        //递归遍历左边的数组
        new QuickSort2(num,left,i-1);
        //递归遍历右边的数组
        new QuickSort2(num,i+1,right);
    }

//主函数，输出功能
    public static void main(String[] args) {
        int[] num={1,2,4,6,7,3,9,5,8};
        //为排序前
        System.out.println("排序前"+Arrays.toString(num));
        //排序后
        new QuickSort2(num,0,num.length-1);
        System.out.println("排序后"+Arrays.toString(num));
        System.out.println("数组个数："+num.length);
        System.out.println("排序次数="+count);
    }

}
