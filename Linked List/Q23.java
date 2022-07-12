class Q23 {

    static class Node {
        char data;
        Node prev;
        Node next;
    }

    static Node head = null;

    static void rotate(int N) {
        if (N == 0)
            return;

        Node curr = head, last = head, prev_=null;
        while (last.next != null) {
            last = last.next;
        }
        for (int i = 0; i < N; i++) {
            prev_=curr;
            curr = curr.next;
        }
        prev_.next=null;
        last.next=head;
        head.prev=last;
        head.prev=null;
        head=curr;
    }

    static void push(char new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.prev = null;
        new_node.next = (head);
        if ((head) != null)
            (head).prev = new_node;
        head = new_node;
    }

    static void printList(Node node) {
        while (node != null && node.next != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        if (node != null)
            System.out.print(node.data);
    }

    public static void main(String[] args) {
        push('h');
        push('g');
        push('f');
        push('e');
        push('d');
        push('c');
        push('b');
        push('a');

        int N = 4;

        printList(head);
        rotate(N);
        System.out.println();
        printList(head);
    }
}
