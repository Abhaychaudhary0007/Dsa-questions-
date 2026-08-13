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
    public ListNode removeNodes(ListNode head) {
        ListNode dummy=new ListNode(-1);
        ListNode temp=head;
        head=dummy;
        Stack<Integer> st=new Stack<>();
        
        while(temp!=null){
             while (!st.isEmpty() && st.peek() < temp.val) {
                    st.pop();
                      }
            st.push(temp.val);
            temp=temp.next;
        }

         while(st.size()!=0){
            head.next=new ListNode(st.pop());
            head=head.next;
         }
           ListNode prev = null;

        ListNode curr = dummy.next;

        while (curr != null) {

            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;

        }
         return prev;
    }
}