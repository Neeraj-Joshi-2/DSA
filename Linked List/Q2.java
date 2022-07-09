class Q2 {
	Node head; 
	class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	public void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	boolean detectLoop()
	{
		Node slow = head, fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println(slow.data);
                System.out.println(fast.data);
                return true ;
            }
        }
        return false;
	}

	public static void main(String args[])
	{
		Q2 llist = new Q2();

		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(10);

		llist.head.next.next.next.next = llist.head;

		System.out.println(llist.detectLoop());
	}
}
