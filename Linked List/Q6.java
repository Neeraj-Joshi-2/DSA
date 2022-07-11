import java.util.HashSet;

class Q6 {

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

    public void removeDuplicates() 
    {
        HashSet<Integer> set = new HashSet<>() ;
        Node curr = head, prev=null ;
        while(curr!=null){
            if(set.contains(curr.data)){
                prev.next=curr.next;
            }else{
                set.add(curr.data) ;
                prev=curr;
            }
            curr=curr.next;
        }
    }

	void remove_duplicates()
	{
		Node ptr1 = null, ptr2 = null;
		ptr1 = head;

		while (ptr1 != null && ptr1.next != null) {
			ptr2 = ptr1;

			while (ptr2.next != null) {
				if (ptr1.data == ptr2.next.data) {
					ptr2.next = ptr2.next.next;
					System.gc();
				}
				else {
					ptr2 = ptr2.next;
				}
			}
			ptr1 = ptr1.next;
		}
	}

	void printList(Node node)
	{
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
        System.out.println();
	}

	public static void main(String[] args)
	{
		Q6 list = new Q6();
		head = new Node(10);
		head.next = new Node(12);
		head.next.next = new Node(11);
		head.next.next.next = new Node(11);
		head.next.next.next.next = new Node(12);
		head.next.next.next.next.next = new Node(11);
		head.next.next.next.next.next.next = new Node(10);

		list.printList(head);
		// list.remove_duplicates();
		list.removeDuplicates();
		list.printList(head);
	}
}
