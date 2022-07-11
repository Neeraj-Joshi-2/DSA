class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;next=null;
    }
}


class Q18
{
    public static Node deleteNode(Node head,int d)
    {
        Node curr=head,prev=null;
        while(curr.data!=d){
            prev=curr;
            curr=curr.next ;
        }
        prev.next=curr.next;
        
        return head;
    }
    public static Node reverse(Node head)
    {
        Node prev = null;
		Node current = head;
		Node next = null;
		while (current.next != head) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		next = current.next;
		current.next = prev;
		prev = current;
		current = next;
		current.next=prev;
		
		return prev;
    }
    public static void main(String[] args) {
        
    }
}