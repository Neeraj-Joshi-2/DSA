class Q17 {
    Node head;
    Node slow_ptr, fast_ptr, second_half;

    class Node {
        char data;
        Node next;

        Node(char d) {
            data = d;
            next = null;
        }
    }

    static Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    boolean isPalindrome(Node head) {
        if (head == null || head.next == null)
            return true;
        Node slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = reverse(slow);
        Node temp1 = head, temp2 = prev.next;
        while (temp1 != prev.next) {
            if (temp1.data != temp2.data) {
                prev.next = reverse(prev.next);              //make the original list
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        prev.next = reverse(prev.next);              //make the original list
        return true;
    }

    public void push(char new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    static void printList(Node ptr) {
        while (ptr != null) {
            System.out.print(ptr.data + "->");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Q17 llist = new Q17();

        char str[] = { 'a', 'b', 'a', 'c', 'a', 'b', 'e' };

        for (int i = 0; i < 7; i++) {
            llist.push(str[i]);
        }
        printList(llist.head);
        System.out.println(llist.isPalindrome(llist.head));
        printList(llist.head);

        /*
        for (int i = 0; i < 7; i++) {
            llist.push(str[i]);
            llist.printList(llist.head);
            if (llist.isPalindrome(llist.head) != false) {
                System.out.println("Is Palindrome");
                System.out.println("");
            } else {
                System.out.println("Not Palindrome");
                System.out.println("");
            }
        }
        */
    }
}
