// Java program to reverse a doubly linked list

class Q19 {

	static Node head;

	static class Node {

		int data;
		Node next, prev;

		Node(int d)
		{
			data = d;
			next = prev = null;
		}
	}

	void reverse()
	{
		Node temp = null;
		Node current = head;

		while (current != null) {
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			current = current.prev;
		}

		/* Before changing head, check for the cases like empty list and list with only one node */
		if (temp != null) {
			head = temp.prev;
		}
	}

	void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.prev = null;
		new_node.next = head;
		if (head != null) {
			head.prev = new_node;
		}
		head = new_node;
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
		Q19 list = new Q19();

		list.push(2);
		list.push(4);
		list.push(8);
		list.push(10);

		System.out.println("Original linked list ");
		list.printList(head);

		list.reverse();
		System.out.println("");
		System.out.println("The reversed Linked List is ");
		list.printList(head);
	}
}

// This code has been contributed by Mayank Jaiswal
