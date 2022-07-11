class Q10
{
	static Node a = null, b = null;
	static Node dummy = null;
	static Node tail = null;
	
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	void printList(Node start) {
		Node p = start;
		while (p != null) {
			System.out.print(p.data + " ");
			p = p.next;
		}
		System.out.println();
	}
	
    public static Node findIntersection(Node head1, Node head2)
    {
        Node start1=head1, start2=head2, newHead=null, temp=null;
        while(start1!=null && start2!=null){
            if(start1.data==start2.data){
                Node node = new Node(start1.data);
                if(newHead==null){
                    newHead=node;
                    temp=node;
                }
                else{
                    temp.next=node;
                    temp=temp.next;
                }
                start1=start1.next;
                start2=start2.next;
            }
            else if(start1.data<start2.data){
                start1=start1.next;
            }
            else{
                start2=start2.next;
            }
        }
        return newHead;
    }
	
	public static void main(String args[])
	{
		Q10 list = new Q10();
		
		a = new Node(1);
		a.next = new Node(2);
		a.next.next = new Node(3);
		a.next.next.next = new Node(4);
		a.next.next.next.next = new Node(6);

		b = new Node(2);
		b.next = new Node(4);
		b.next.next = new Node(6);
		b.next.next.next = new Node(8);
		
		Node head = findIntersection(a,b);
	
		list.printList(head);
	}
}

