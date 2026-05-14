class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class removeLinkedList {

    public static Node head;
    public static Node tail;

    public static void add1st(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void addlst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void addany(int idx, int data) {
        if (idx == 0) {
            add1st(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < idx - 1 && temp != null) {
            temp = temp.next;
            i++;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Invalid index.");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void Print() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void remove1st() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }

    public static void removeKth(int k) {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        if (k == 0) {
            remove1st();
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < k - 1 && temp != null) {
            temp = temp.next;
            i++;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Invalid index.");
            return;
        }
        if (temp.next == tail) {
            tail = temp;
        }
        temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        removeLinkedList list = new removeLinkedList();
        list.add1st(3);
        list.add1st(2);
        list.addlst(4);
        list.addany(2, 5);

        System.out.println("Original List:");
        list.Print();

        list.removeKth(2);
        System.out.println("After removing node at 2nd index:");
        list.Print();
    }
}
