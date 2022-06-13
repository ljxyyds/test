package com.need;
//折半查找算法
public class BinSearch {
    //非递归
    //多数情况下使用非递归的方式
    public int BinSerch(int num[], int left, int right, int key) {
        while (left <= right) {
            //找中间值
            int mid = (left + right) / 2;
            //判断是否是查找的值
            if (num[mid] == key) {
                return mid;
                //如果是想要找的值小于中间值，就向左边移动一位，再进行上面的操作
            } else if (key < num[mid]) {
                right = mid - 1;
                //如果想要找的值大于中间值，就向右边移动一位，再进行上面的操作
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
//递归
    public int BinRecSearch(int[] num, int left, int right, int key) {
        if (left <= right) {
            int mid = (right + left) / 2;
            if (num[mid] == key) {
                return mid;
            } else if (key < num[mid]) {
                return BinRecSearch(num, left, mid - 1, key);

            } else {
                return BinRecSearch(num, mid + 1, right, key);

            }
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        //非递归
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //创建一个类来调用方法
        BinSearch binSearch = new BinSearch();
        /**
         * 第一项：要遍历的数组
         * 第二项：遍历开始的位置
         * 第三项：遍历结束的位置
         * 第四项：查找元素的位置
         */
        int pos1 = binSearch.BinSerch(num, 0, num.length - 1, 10);
        if (pos1 != -1) {
            System.out.println("查找元素所在位置下标是:" + pos1);
        } else {
            System.out.println("找不到该元素");
        }
        //递归
        int pos2 = binSearch.BinRecSearch(num, 0, num.length - 1, 7);
        if (pos2 != -1) {
            System.out.println("查找元素所在的位置下表是：" + pos2);
        } else {
            System.out.println("找不到概元素");
        }
    }
}

