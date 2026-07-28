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

    static ListNode reverse(ListNode head){
       ListNode prev=null;
       ListNode current=head;
       ListNode next=null;
       while(current!=null){
        next=current.next;
        current.next=prev;
        prev=current;
        current=next;
       }
       return prev;

    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode slow=head;
        ListNode fast=head;


        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        ListNode head2=slow.next;
        slow.next=null;
        ListNode a=reverse(head2);

        while(a!=null && head!=null){
            if(a.val!=head.val){
                return false;
            }
        a=a.next;
            head=head.next;
        }

        return true;
    }
}