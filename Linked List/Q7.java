class Q7
{
	Node head; 
	class Node
	{
		int data;
		Node next;
		Node(int d) {data = d; next = null; }
	}

	void moveToFront()
	{
		if(head == null || head.next == null)
			return;

		Node secLast = null;
		Node last = head;

		while (last.next != null)
		{
		secLast = last;
		last = last.next;
		}
		secLast.next = null;
		last.next = head;
		head = last;
	}				

	public void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	void printList()
	{
		Node temp = head;
		while(temp != null)
		{
		System.out.print(temp.data+" ");
		temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String args[])
	{
		Q7 llist = new Q7();
		llist.push(5);
		llist.push(4);
		llist.push(3);
		llist.push(2);
		llist.push(1);
		
		llist.printList();
		llist.moveToFront();
		llist.printList();
	}
}
