
class Solution {

    // deepcopy

    public Node deepcopy(Node head){
        Node temp1=head;
        Node head2=new Node(-1);
        Node temp2=head2;

        while(temp1!=null){
            Node t=new Node(temp1.val);
            temp2.next=t;
            temp2=temp2.next;
            temp1=temp1.next;
        }
        return head2.next;
    } 
      
      // alternate connection

    public void alternative(Node head,Node head2){
        Node dummy=new Node(-1);
        Node t=dummy;
        Node temp1=head;
        Node temp2=head2;
        while(temp1!=null && temp2!=null){
            t.next=temp1;
             t=t.next;
            temp1=temp1.next;

            t.next=temp2;
            t=t.next;
            temp2=temp2.next;   
        }
    }

     // random connections

    public void random(Node head1,Node head2){
         Node temp1=head1;
        Node temp2=head2;
        while(temp1!=null){
            if(temp1.random==null) {temp2.random=null;
            }

            else {
                temp2.random=temp1.random.next;}
                temp1=temp1.next.next;

               if(temp2.next!=null) temp2=temp2.next.next;
            
        }
    }

    // Spliting the next connection

    public Node split(Node head1){
        Node dummy1=new Node(-1);
        Node dummy2=new Node(-1);
        Node temp1=dummy1;
        Node temp2=dummy2;
        Node temp=head1;
        
        while(temp!=null){
        temp1.next=temp;
        temp=temp.next;
         temp1=temp1.next;

        temp2.next=temp;
        temp=temp.next;
        temp2=temp1.next;
        }

        temp1.next=null;

        return dummy2.next;
    }

    public Node copyRandomList(Node head) {
        Node head2=deepcopy(head);
       alternative(head,head2);
       random(head,head2);
      
       return split(head); 
    }
}