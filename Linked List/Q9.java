class Q9 {

    static Node head1, head2;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node reverseList(Node list) {
        Node prev = null, curr = list, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    static void addTwoLists(Node first, Node second) {
        first = reverseList(first);
        second = reverseList(second);

        int carry = 0;
        Node sum = null;

        while (first != null || second != null || carry == 1)                                          
        {
            int newVal = carry;

            if (first != null)
                newVal += first.data;
            if (second != null)
                newVal += second.data;

            carry = newVal / 10; 
            newVal = newVal % 10;

            Node newNode = new Node(newVal);
            newNode.next = sum; 
            sum = newNode;

            if (first != null) 
                first = first.next;
            if (second != null)
                second = second.next;
        }
        printList(sum);
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        head1 = new Node(9);
        head1.next = new Node(8);
        head1.next.next = new Node(7);
        printList(head1);

        head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        printList(head2);

        addTwoLists(head1, head2);
    }
}
