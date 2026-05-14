class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class RemoveLoopInLL {
    public static Node head;
    
    public static void removeLoop(){
        Node slow=head;
        Node fast=head;
        boolean flag=false;

        while(fast!=null && fast.next!=null){  //To detect Loop in LL

            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                flag=true;
                break;
            }
        }
        if(flag==false){
        return;
        }

        // find meeting point

        slow=head;
        Node prev=null; //last node 
        slow=slow.next;

        while(slow!=fast){
            slow=slow.next;
            prev=fast;
            fast=fast.next;
        }

        //remove cycle -> last node.next-> null
            prev.next=null;

    }
    public static void main(String[] args) {
        head=new Node(10);
        Node temp=new Node(20);
        head.next=temp;
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=temp;

        removeLoop();
        System.out.println(removeLoop());
    }
}

