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

    ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode current =head;
        ListNode next=null;
        
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
        
    }
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        ListNode a=slow.next;
        ListNode head2=reverse(a);
        int max=0;
        int sum=0;
        while(head2!=null){
          sum=head2.val+head.val;
          head2=head2.next;
          head=head.next;
        max=  Math.max(max,sum);
        }

        return max;
    }
}