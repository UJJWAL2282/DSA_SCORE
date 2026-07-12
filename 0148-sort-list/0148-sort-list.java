/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        //merge Sort

        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = findMid(head);
        ListNode rightHead = mid.next;
        mid.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);

        return merge(left, right);
    }

    private ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private ListNode merge(ListNode leftHead, ListNode rightHead) {

        ListNode head = new ListNode(-1);
        ListNode tail = head;

        while (leftHead != null && rightHead != null) {
            if (leftHead.val < rightHead.val) {
                tail.next = leftHead;
                tail = tail.next;
                leftHead = leftHead.next;

            } else {
                tail.next = rightHead;
                tail = tail.next;
                rightHead = rightHead.next;
            }

        }

        while (leftHead != null) {

            tail.next = leftHead;
            tail = tail.next;
            leftHead = leftHead.next;

        }

        while (rightHead != null) {

            tail.next = rightHead;
            tail = tail.next;
            rightHead = rightHead.next;

        }

        return head.next;
    }
}