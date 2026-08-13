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
      
        ListNode temp=head;
      
        Stack<Integer> st=new Stack<>();
        
        while(temp!=null){
             while (!st.isEmpty() && st.peek() < temp.val) {
                    st.pop();
                      }
            st.push(temp.val);
            temp=temp.next;
        }
             head=null;
         while(st.size()!=0){
           ListNode t =new ListNode(st.pop());
            if(head==null){
                head=t;
            }
            else {
                t.next=head;
                head=t;
            }
         }
       

       return head;
    }
}