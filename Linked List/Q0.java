class Q0 {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}

    static Node reverseList(Node head)
    {
        if (head == null || head.next == null)
            return head;
 
        Node rest = reverseList(head.next);
        head.next.next = head;
        
        head.next = null;
 
        return rest;
    }

	Node reverse(Node node)
	{
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

	void printList(Node node)
	{
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args)
	{
		Q0 list = new Q0();
		head = new Node(85);
		head.next = new Node(15);
		head.next.next = new Node(4);
		head.next.next.next = new Node(20);

		list.printList(head);
        System.out.println();
		head = list.reverse(head);
		list.printList(head);
        System.out.println();
        head = reverseList(head);
        list.printList(head);
	}
}
