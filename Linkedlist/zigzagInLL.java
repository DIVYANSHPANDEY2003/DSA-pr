
class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class zigzagInLL {

    public  Node head;

    public void zigzag() {
        if (head == null && head.next == null) {
            return; // No need to process if the list has 0 or 1 node
        }

        //find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        //merge 
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            if (nextL == null) 
            break;
            nextR = right.next;
            right.next=nextL;
            left = nextL;
            right = nextR;
            
        }

    }

        //push 

    public void push(int data){
        Node newNode =new Node(data);
        newNode.next=head;
        head=newNode;
    }

    //print 
    public void printlist() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    
    public static void main(String[] args) {
        zigzagInLL ll=new zigzagInLL();
        ll.push(101);
        ll.push(102);
        ll.push(103);
        ll.push(104);
        ll.push(105);
        ll.push(106);
        ll.push(107);
        ll.printlist();
        ll.zigzag();
        ll.printlist();
    }
}
