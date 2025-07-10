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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode c1 = list1;
        ListNode c2 = list2;
        ListNode res = new ListNode();
        ListNode cur = res;
        while (c1 != null && c2 != null){
            if(c1.val < c2.val){
                cur.next = c1;
                c1 = c1.next;
            }
            else if(c1.val >= c2.val){
                cur.next = c2;
                c2 = c2.next;
            }
            cur = cur.next;
        }
        if (c1 != null) {
            cur.next = c1;
        } else {
            cur.next = c2;
        }
        return res.next;
    }
}