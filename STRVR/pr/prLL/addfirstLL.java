public class addfirstLL {
    public static class Node{
        int data;
        Node next;
    
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public static Node head;
public static Node tail;
public static int size;

    public void addfrst(int data) {
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        
        newNode.next=head;
        head=newNode;
        
    }
    public void addLst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            
            return ;
        }
        tail.next=newNode;
        tail=newNode;
        
    }
    public void addAny(int indx,int data){
        Node newNode=new Node(data);
        if(indx==0){
            addfrst(data);
            return ;
        }
        else if(indx==1){
            head=tail=newNode;
            return ;
        }
        size++;
        Node temp=head;
        int i=0;
        while(i<indx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }
    public static void main(String[] args) {
        addfirstLL ll=new addfirstLL();
        ll.addfrst(10);
        ll.addfrst(20);
        ll.addfrst(30);
        ll.addLst(40);
        ll.addLst(50);
        ll.addAny(3,35 );

        
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("size:" +size);
    }
        
    }





    