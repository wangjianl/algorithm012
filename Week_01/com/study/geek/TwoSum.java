package com.study.geek;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9  所以返回 [0, 1]
 */
public class TwoSum {

    /**
     * 暴力循环
     *
     * @param nums
     * @param target 时间复杂度O(n^2)
     *               空间复杂度O(1)
     * @return
     */
    public static int[] solution1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * 字典缓存
     *
     * @param nums
     * @param target 时间复杂度O(n)
     *               空间复杂度O(1)
     * @return
     */
    public static int[] solution2(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int j = 0; j < nums.length; j++) {
            int temp = target - nums[j];
            if (map.containsKey(temp)) {
                return new int[]{j, map.get(temp)};
            }
        }
        return null;
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int[] temp = solution2(arr, 9);
        System.out.println(Arrays.toString(temp));

    }
}
