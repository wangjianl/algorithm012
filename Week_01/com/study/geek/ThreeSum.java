package com.study.geek;

import java.util.*;

/**
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，
 * 使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 * 示例：
 * <p>
 * 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * <p>
 * 满足要求的三元组集合为：
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 */
public class ThreeSum {

    public static List<int[]> solution1(int[] nums) {
        //先进行升序排序
        Arrays.sort(nums);
        if (null == nums || nums.length < 3) {
            return null;
        }
        /**定义结果对象*/
        Set<List> result = new HashSet();
        for (int n = 0; n < nums.length - 2; n++) {
            //已经升序排列了，nums[n]如果大于0，后面再相加不可能等于0了
            if (nums[n] > 0) {
                break;
            }
            int left = n + 1;//左指针
            int right = nums.length - 1;//右指针
            while (left < right) {
                if (nums[n] + nums[left] + nums[right] == 0) {
                    result.add(Arrays.asList(nums[n], nums[left], nums[right]));
                    left++;
                } else if (nums[n] > nums[left] + nums[right]) {
                    left++;
                } else if (nums[n] < nums[left] + nums[right]) {
                    right--;
                }
            }
        }
        return new ArrayList(result);
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        solution1(nums).forEach(x -> System.out.println(x));
    }
}
