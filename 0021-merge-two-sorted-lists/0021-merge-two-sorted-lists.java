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
        //decreasing recursive function. 
        //Base case: if list1==null, return list 2 because list1 is at the end
        // vice versa.
        //Recursive parts: if list1.val<list2.val, return list1 and decreast it by recursively put the lists in the function and put list.next into the new parameters.
        if(list1 != null && list2 != null){
            if(list1.val < list2.val){
                //recursively call the function and pass the list.next
                list1.next= mergeTwoLists(list1.next, list2);
                return list1;
            }
            else{
                
                list2.next=mergeTwoLists(list1, list2.next);
                return list2;
            }
        }
        if(list1 ==null)return list2;
        return list1;
    }
}