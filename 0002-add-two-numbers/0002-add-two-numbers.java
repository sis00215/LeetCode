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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //extract each digit and make it into an integer : each iteration, a digit *10^i
        // add two numbers and extract it out as linked list with n/=10 each iteration
    //     int list1 = 0;
    //     int list2 = 0;
    //     int i = 0;
    //     int j = 0;
    //     ListNode dummy = new ListNode ();
    //     ListNode ans = dummy;
        
    //     //extracting the list1
    //     while(l1 !=null){
            
    //         int digit = (int)Math.pow(10, i);
    //         list1 += (l1.val)*(digit);
    //         i++;
    //         l1 = l1.next;
    //     }
    //     //extracting the list2
    //     while(l2 !=null){

    //         int digit = (int)Math.pow(10,j);
    //         list2 += (l2.val)*(digit);
    //         j++;
    //         l2 = l2.next;
    //     }
    //    // System.out.println("list1:"+list1+"  list2:"+list2);
    //     int result = list1+list2;
    //     //System.out.println("resutl = "+result);
    //    if (result == 0) {
    //         return new ListNode(0);
    //     }
    //     System.out.println("list1:"+list1+". List2:"+list2);
    //     // Extracting each digit and creating new nodes
    //     while (result > 0) {
    //         int current = result % 10;
    //         ans.next = new ListNode(current); // Create a new ListNode with the current digit
    //         result /= 10;
    //         ans = ans.next; // Move to the next node
    //     }
    //    // System.out.println(ans.val);
        
    //     return dummy.next;

    // the concept is that you are adding each digit and carry over the carry to the next node.
    ListNode dummy = new ListNode(0);
    ListNode current = dummy;
    int carry = 0;
    //Itearte until either list hasn't reached the end or there is a carry to be added'
    while(l1 !=null || l2 != null || carry==1){
        int sum = 0; // this sum is instantiated in every iteration
        if(l1 != null){
            sum += l1.val;
            l1=l1.next;
        }
        if(l2 != null){
            sum += l2.val;
            l2=l2.next;
        }
        //Now lets consider the sum is 12, we leave the current node 2 and carry over 1 to the next node
            sum+=carry; // add carry from previous iteration if there is any
            carry = sum/10; // carry is now the sum's 10th digit' if there is any
            ListNode node = new ListNode(sum%10); // create a node with 1's digit '     
            current.next = node; //starting after dummy node, add the 1's digit sum to the head node'
            current = current.next;
    }
    return dummy.next;


    }
}