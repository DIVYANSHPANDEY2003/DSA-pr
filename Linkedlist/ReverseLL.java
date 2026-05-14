
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    public class ReverseLL {
        Node head;

        public void reverse(){
            Node prev=null;
            Node curr=head;
            Node next=null;

            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
        }

        public void push(int data){
            Node newNode =new Node(data);
            newNode.next=head;
            head=newNode;
        }

        public void printlist(){
            
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;

            }
            System.out.println("null");
        }

        public static void main(String[] args) {
            ReverseLL ll=new ReverseLL();
            ll.push(10);
            ll.push(20);
            ll.push(30);
            ll.push(40);
            System.out.println("original linkedlist is ");
            ll.printlist();
            ll.reverse();
            System.out.println("reversed linkedlist");
            ll.printlist();            
        }
    }