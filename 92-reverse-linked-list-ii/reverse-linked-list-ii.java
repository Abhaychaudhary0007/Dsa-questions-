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
    void reverse(ListNode head){
        ListNode prev=null;
        ListNode current=head;
        ListNode next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
    }
    public ListNode reverseBetween(ListNode head, int l, int r) {
        if(head == null || head.next == null || l == r) return head;
        ListNode dummy =new ListNode(-1);
        dummy.next=head;
        int position=0;
        ListNode temp=dummy;
        ListNode head2=head;
        ListNode tail1=head;
        ListNode tail2=head;
        ListNode head3=head;
        for(int i=1;i<l;i++){
           temp=temp.next;
        } 
         tail1=temp;
         head2=temp.next;

        for(int i=1;i<r-l+2;i++){
             temp=temp.next;
             }
            tail2=temp;
            head3=temp.next;
              
        tail1.next=null;
        tail2.next=null;

        reverse(head2);
        tail1.next=tail2;
        head2.next=head3;

        return dummy.next;
    }
}