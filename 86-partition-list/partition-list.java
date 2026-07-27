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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy=new ListNode(-1);
        ListNode dummy1= new ListNode(-1);
        ListNode temp=head;
        ListNode t1=dummy;
        ListNode t2=dummy1;

        while(temp!=null){
            if(temp.val<x){
                t1.next=temp;
                t1=t1.next;
            }
            else {
                t2.next=temp;
                t2=t2.next;
            }
            temp=temp.next;
        }
        t1.next=dummy1.next;
        t2.next=null;

        return dummy.next;
    }
}