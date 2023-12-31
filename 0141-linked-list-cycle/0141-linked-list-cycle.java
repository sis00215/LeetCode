/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        /**Floyd's two pointer algorithms. start at head with two pointers, one traverse with 1 next, the other with 2 next. Basically traversing with 2 different speed. if they meet, it means there is a cycle: wrong clock gets right at least twice a day' */
        ListNode slow_pointer = head, fast_pointer = head;
        while(fast_pointer !=null && fast_pointer.next != null){
            //traverse in different speed
            slow_pointer = slow_pointer.next;
            fast_pointer = fast_pointer.next.next;
            if(slow_pointer == fast_pointer) return true;
        }
        return false;
    }
}