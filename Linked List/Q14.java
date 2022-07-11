// class Q14 {

//     public ListNode middleNode(ListNode head) {
//         ListNode slow = head, fast = head;
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }

//     public ListNode middleNode(ListNode head) {
//         int length=0 ;
//         ListNode temp=head;
//         while(temp!=null){
//             length++;
//             temp=temp.next;
//         }
//         // System.out.println(length);
//         temp=head;
//         for(int i=0; i<length/2 ; i++){
//             temp=temp.next;
//         }
//         return temp ;
//     }
//     public static void main(String[] args) {
        
//     }
// }