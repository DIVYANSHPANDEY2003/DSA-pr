class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class PalindromeLL {
    Node head;

    // Slow-Fast Approach to find the middle
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Check if LinkedList is Palindrome
    public boolean CheckPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find mid
        Node midNode = findMid(head);

        // Step 2: Reverse the second half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // Right half head (Reversed)
        Node left = head;

        // Step 3: Compare both halves
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printlist() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        PalindromeLL ll = new PalindromeLL();
        ll.push(1);
        ll.push(2);
        ll.push(1);
        ll.push(2);
        ll.push(1);
        ll.printlist();

        boolean result = ll.CheckPalindrome();
        System.out.println("Is Palindrome: " + result);
    }
}
