
public class AddLinkedList{
    public static class node{
        int data;
        node next;

        public node(int data){
            this.data=data;
            this.next=null;     
        }

    }
    public static node head;
    public static node tail;

    public static void addfirst(int data){
        node newnode=new node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }

        newnode.next=head;
        head=newnode;
    }

    public void Addlast(int data){
        node newnode=new node(data);
        if(head==null){
           head=tail=newnode;
           return; 
        }
        tail.next=newnode;
        tail=newnode;

    }

    public void Print(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        node temp=head;      
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx,int data){
        if(idx==0){
            addfirst(data);
            return;
        }
        node newnode =new node(data);
        node temp =head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public static void main(String[] args) {
        AddLinkedList ll=new AddLinkedList();
        ll.Print();
        ll.addfirst(1);
        ll.Print();
        ll.addfirst(2);
        ll.Print();
        ll.Addlast(10);
        ll.Print();
    }
}