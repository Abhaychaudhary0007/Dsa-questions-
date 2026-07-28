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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        ListNode a=slow.next;
        slow.next=null;
        ListNode head2=reverse(a);
      int n=1;
      ListNode dummy=new ListNode(-1);
      ListNode temp=dummy; 
        while(head2!=null && head!=null){
          if(n%2!=0){
            temp.next=head;
            temp=temp.next;
            head=head.next;
            n++;
          }
          else{
            temp.next=head2;
            temp=temp.next;
            head2=head2.next;
            n++;
          }
        }
      if(head!=null){
        temp.next=head;
      }else{
        temp.next=head2;
      }
        

        
    }
}