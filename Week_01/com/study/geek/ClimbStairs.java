package com.study.geek;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 * <p>
 * 示例 1：
 * <p>
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 */
public class ClimbStairs {

    /**
     * 递归的方式
     * 时间复杂度:O(2^n)
     * 空间复杂度:O(n)
     *
     * @param n
     * @return
     */
    public static int solution1(int n) {
        if (n <= 2) {
            return n;
        }
        return solution1(n - 1) + solution1(n - 2);
    }

    /**
     * 动态规划
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     *
     * @param n
     * @return
     */
    public static int solution2(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int stairs = solution1(8);
        System.out.println("stairs:" + stairs);
    }
}
