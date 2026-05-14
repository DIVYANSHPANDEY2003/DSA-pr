class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class DetectLoopInLL {
    public static Node head;

     public static boolean toCheckLoop(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
     }

     public static void main(String[] args) {
        head= new Node(10);
        head.next=new Node(20);
        head.next.next = new Node(30);
        head.next.next.next=head;

        System.out.println(toCheckLoop());

     }
}
