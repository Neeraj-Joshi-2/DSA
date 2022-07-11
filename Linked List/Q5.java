class Q5
{
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int d) {data = d; next = null; }
	}

    Node removeDuplicates_()
    {
        Node curr=head ;
        while(curr!=null){
            while(curr.next != null && curr.data==curr.next.data){
                curr.next=curr.next.next;
            }
            curr=curr.next;
        }
		return head;
    }

	void removeDuplicates()
	{
		Node curr = head;
		while (curr != null) {
			Node temp = curr;
			while(temp!=null && temp.data==curr.data) {
				temp = temp.next;
			}
			curr.next = temp;
			curr = curr.next;
		}
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
		while (temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
    
	public static void main(String args[])
	{
		Q5 llist = new Q5();
		llist.push(20);
		llist.push(13);
		llist.push(13);
		llist.push(11);
		llist.push(11);
		llist.push(11);

		llist.printList();
		// llist.removeDuplicates(); 
		llist.removeDuplicates_();
		llist.printList();
	}
}
