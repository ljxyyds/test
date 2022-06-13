package com.need;

import java.util.Arrays;
//冒泡排序算法
public class BubblingSort {
    public static void main(String[] args) {
        int[] arrays=new int[]{2,4,1,3,8,5,9,6,7};
        int temp=0;
        //boolean flag=false;
        for (int i = 0; i<arrays.length-1 ; i++) {
            for (int j = 0; j < arrays.length-1-i ; j++) {
                if (arrays[j]>arrays[j+1]){
                   // flag=true;
                     temp=arrays[j];
                    arrays[j]=arrays[j+1];
                    arrays[j+1]=temp;
                }
            }
//            if (!flag){
//                break;
//            }
//            else {
//                flag=false;
//            }
        }
        System.out.println(Arrays.toString(arrays));
    }
}
