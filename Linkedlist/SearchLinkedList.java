class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SearchLinkedList {
    public static Node head;

    // Add elements to the linked list
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Iterative Search in Linked List
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // Print Linked List
    public void printlist() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SearchLinkedList ll = new SearchLinkedList();

        ll.push(101);
        ll.push(102);
        ll.push(103);
        ll.push(104);
        ll.printlist();

        System.out.println("Element found at index: " + ll.itrSearch(103));
        System.out.println("Element not found: " + ll.itrSearch(110));
    }
}
