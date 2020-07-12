package com.study.geek;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个链表，判断链表中是否有环。
 * <p>
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 * <p>
 * 示例 1：
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 */
public class HasCycle {

    /**
     * 环形追击，快慢指针
     *
     * @param head
     * @return
     */
    public static boolean solution1(ListNode head) {
        if (null == head) {
            return false;
        }
        ListNode slow = head.next;
        ListNode quick = head.next.next;
        while (quick != null && quick.next != null) {
            if (slow == quick) {
                return true;
            }
            slow = head.next;
            quick = head.next.next;
        }
        return false;
    }

    /**
     * 缓存比较，是否有重复数据
     *
     * @param head
     * @return
     */
    public static boolean solution2(ListNode head) {
        if (null == head) {
            return false;
        }
        List list = new ArrayList();
        while (null != head.next) {
            if (list.contains(head.next)) {
                return true;
            }
            list.add(head.next);
            head = head.next.next;
        }
        return false;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
