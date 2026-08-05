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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int [] ans={-1,-1};
        
        if(head==null || head.next==null || head.next.next==null) return ans;
        ListNode a=head;
        ListNode b=head.next;
        ListNode c=head.next.next;
        int idx=1;
        int first=-1;
        int last=-1;
        int minsub=Integer.MAX_VALUE;
        int sum=0;

        while(c!=null){
            if((b.val> a.val && b.val>c.val) || (b.val<a.val && b.val<c.val)){
               if(first==-1){
                first=idx;
                last=idx;
               }
               else{
                sum=idx-last;
                last=idx;
                minsub=Math.min(minsub,sum);
               }
               a = b;
               b = c;
               c = c.next;
               idx++;
            }
            else{
                a=b;
                b=c;
                c=c.next;
               
                 idx++;
            }
            

            
        }
        if(first==-1 || first==last) return ans;
        int max=last-first;
        ans[0]=minsub;
        ans[1]=max;

        return ans;
    }
}