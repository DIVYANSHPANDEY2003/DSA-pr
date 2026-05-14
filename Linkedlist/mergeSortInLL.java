
class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class mergeSortInLL {

    public static Node head;

    //to find mid 
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast == null || fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;  //mid node 
    }

    //merge 
    private Node merge(Node head1, Node head2) {

        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        // Append remaining nodes
        if (head1 != null) {
            temp.next = head1;
        }
        if (head2 != null) {
            temp.next = head2;
        }

        return mergedLL.next;
    }

    public Node mergeSrt(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // to find mid 
        Node mid = getMid(head);
        //left and right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSrt(head);
        Node newRight = mergeSrt(rightHead);
        //merge
        return merge(newLeft, newRight);
    }

    // Print linked list
    public void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        mergeSortInLL ll = new mergeSortInLL();
        head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);

        System.out.println("Original List:");
        ll.printList(head);

        head = ll.mergeSrt(head);

        System.out.println("Sorted List:");
        ll.printList(head);
    }
}
