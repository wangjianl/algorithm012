package com.study.geek;

import java.util.*;

/**
 * 移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 示例:
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 * <p>
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 */
public class MoveZeroes {

    /**
     * 循环替换非零元素
     * <p>
     * 时间复杂度O(n)
     * 空间复杂度O(1)
     *
     * @param arr
     */
    public static int[] solution1(int[] arr) {
        int mark = 0;//记录零的位置
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[mark++] = arr[i];
                arr[i] = 0;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 5, 80, 0, 2, 0};
        System.out.println(Arrays.toString(solution1(arr)));
    }

}
