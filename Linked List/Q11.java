class Q11 {

    static class Node {
        int data;
        Node next;
    };

    static Node intersectPoint(Node head1, Node head2) {
        Node ptr1 = head1;
        Node ptr2 = head2;

        if (ptr1 == null || ptr2 == null) {

            return null;
        }

        while (ptr1 != ptr2) {

            ptr1 = ptr1.next;
            ptr2 = ptr2.next;

            if (ptr1 == ptr2) {

                return ptr1;
            }

            if (ptr1 == null) {

                ptr1 = head2;
            }
            if (ptr2 == null) {

                ptr2 = head1;
            }
        }

        return ptr1;
    }

    static void print(Node node) {
        if (node == null)
            System.out.print("null");
        while (node.next != null) {
            System.out.print(node.data + ".");
            node = node.next;
        }
        System.out.print(node.data);
    }

    public static void main(String[] args) {
        Node newNode;
        Node head1 = new Node();
        head1.data = 10;
        Node head2 = new Node();
        head2.data = 3;
        newNode = new Node();
        newNode.data = 6;
        head2.next = newNode;
        newNode = new Node();
        newNode.data = 9;
        head2.next.next = newNode;
        newNode = new Node();
        newNode.data = 15;
        head1.next = newNode;
        head2.next.next.next = newNode;
        newNode = new Node();
        newNode.data = 30;
        head1.next.next = newNode;
        head1.next.next.next = null;
        Node intersect_node = null;

        intersect_node = intersectPoint(head1, head2);
        System.out.print("INTERSEPOINT LIST :");
        print(intersect_node);
    }
}


class LinkedList {

    static Node head1, head2;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    int getNode() {
        int c1 = getCount(head1);
        int c2 = getCount(head2);
        int d;

        if (c1 > c2) {
            d = c1 - c2;
            return _getIntesectionNode(d, head1, head2);
        } else {
            d = c2 - c1;
            return _getIntesectionNode(d, head2, head1);
        }
    }

    int _getIntesectionNode(int d, Node node1, Node node2) {
        int i;
        Node current1 = node1;
        Node current2 = node2;
        for (i = 0; i < d; i++) {
            if (current1 == null) {
                return -1;
            }
            current1 = current1.next;
        }
        while (current1 != null && current2 != null) {
            if (current1.data == current2.data) {
                return current1.data;
            }
            current1 = current1.next;
            current2 = current2.next;
        }

        return -1;
    }

    int getCount(Node node) {
        Node current = node;
        int count = 0;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        head1 = new Node(3);
        head1.next = new Node(6);
        head1.next.next = new Node(9);
        head1.next.next.next = new Node(15);
        head1.next.next.next.next = new Node(30);

        head2 = new Node(10);
        head2.next = new Node(15);
        head2.next.next = new Node(30);

        System.out.println("The node of intersection is " + list.getNode());
    }
}
