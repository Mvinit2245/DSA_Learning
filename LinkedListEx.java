public class LinkedListEx {
    public static void main(String[] args) {
        Node node = new Node(0);
        System.out.println(node.data);
   
   }

}

class Node{
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
