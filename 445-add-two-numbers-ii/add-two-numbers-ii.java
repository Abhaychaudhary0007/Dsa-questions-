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
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        head1=reverse(head1);
        head2=reverse(head2);
        ListNode ans=new ListNode(-1);
        ListNode temp=ans;
        int carry=0;
        int sum=0;

        while(head1!=null && head2!=null){
          sum=0;
          sum=head1.val+head2.val+carry;
          carry=0;
          if(sum>9){
            carry=sum/10;
            sum=sum%10;
          }
          temp.next=new ListNode(sum);
          temp=temp.next;
          head1=head1.next;
          head2=head2.next;
        }

        while(head1!=null){
            sum=0;
            sum=head1.val+carry;
            carry=0;
            if(sum>9){
                carry=sum/10;
                sum=sum%10;
            }
            temp.next=new ListNode(sum);
            temp=temp.next;
            head1=head1.next;
        }

            while(head2!=null){
            sum=0;
            sum=head2.val+carry;
            carry=0;
            if(sum>9){
                carry=sum/10;
                sum=sum%10;
            }
            temp.next=new ListNode(sum);
            temp=temp.next;
            head2=head2.next;
        }
        if(carry!=0){
            temp.next=new ListNode(carry);
            
        }
        return reverse(ans.next);
    }
}