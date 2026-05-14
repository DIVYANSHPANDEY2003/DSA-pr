
public class Remove_Ll {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;

    public int removeFirst() {
        if (head == null) {
            System.out.println("LL is empty:");
            return -1;
        }
        int val = head.data;
        head = head.next;
        return val;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Remove_Ll ll = new Remove_Ll();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);

        ll.printList();

        System.out.println("Removed: " + ll.removeFirst());
        ll.printList();
    }

}
