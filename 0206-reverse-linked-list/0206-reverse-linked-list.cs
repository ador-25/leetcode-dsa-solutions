/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

 // 1 2 4 5
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head is null)
        {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while(current!=null){
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous; 
    }
}