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
    ListNode merge(ListNode a,ListNode b){
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(a!=null && b!=null){
            if(a.val>b.val){
                temp.next=b;
                b=b.next;
            }
            else{
                temp.next=a;
                a=a.next;
            }
            temp=temp.next;
        }
        if(a!=null){
            temp.next=a;
        }
        else{
            temp.next=b;
        }

        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {

        if(lists.length==0) return null;

        ArrayList<ListNode> arr1=new ArrayList<>();
        ArrayList<ListNode> arr2=new ArrayList<>();
        for(ListNode ele:lists) arr1.add(ele);

        while(arr1.size()+arr2.size()>1){
            while(!arr1.isEmpty()){
               ListNode a = arr1.remove(arr1.size()-1);

if(!arr1.isEmpty()){
    ListNode b = arr1.remove(arr1.size()-1);
    arr2.add(merge(a,b));
}
else{
    // only one node existed
    arr2.add(a);
}
}
                
            

             while(!arr2.isEmpty()){
                ListNode a = arr2.remove(arr2.size()-1);

if(!arr2.isEmpty()){
    ListNode b = arr2.remove(arr2.size()-1);
    arr1.add(merge(a,b));
}
else{
    arr1.add(a);
}
              
            }
        }
       ListNode ans = new ListNode(-1);

if(!arr1.isEmpty()){
    ans = arr1.get(0);
}
else{
    ans = arr2.get(0);
}

return ans;
    }
}