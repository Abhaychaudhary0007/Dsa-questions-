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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(-1);
        ListNode dummy1=new ListNode(-1);
        ListNode t1=dummy;
        ListNode t2=dummy1;
        ListNode temp=head;
        int n=1;
         
         while(temp!=null){
         if(n%2!=0){
            t1.next=temp;
            t1=t1.next;
            n++;
         }
         else {
            t2.next=temp;
            t2=t2.next;n++;
         }
         temp=temp.next;
         }
         
         t1.next=null;
         t2.next=null;

         ListNode dummy2=new ListNode(-1);
         ListNode t3=dummy2;
         int m=1;

         dummy=dummy.next;
          dummy1=dummy1.next;

         while(dummy!=null && dummy1!=null){
            if(m%2!=0){
                t3.next=dummy1;
                t3=t3.next;
                dummy1=dummy1.next;
                m++;
            }
            else{
                  t3.next=dummy;
                  t3=t3.next;
                  dummy=dummy.next;
                  m++;
            }
         }
         if(dummy!=null) {
            t3.next=dummy;
         }
         else{
            t3.next=dummy1;
         }

         return dummy2.next;
    }
}