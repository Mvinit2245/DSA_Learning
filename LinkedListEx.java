import java.util.*;



public class LinkedListEx {
    public static void main(String[] args) {
       Node head1 = new Node(0);
        head1.next = new Node(1);
        head1.next.next = new Node(2); 
        
        
    
         Node current = head1;
          while(current != null) {
             System.out.println(current.data);
             current = current.next;
            }

}

 public static class Node{
    int data;
   Node next;
   

   Node(int data1, Node next1){
    this.data= data1;
    this.next = next1;
   }

   Node(int data1){
    this.data= data1;
    this.next= null;
   }

   
}

   
}

// For adding new at first position
// public static Node insertNode(Node head, int val){
//     return new Node(val, head);

//     Node temp = new Node(data);
//     temp.next = head;
//     head = temp;
//     return head;
// }
