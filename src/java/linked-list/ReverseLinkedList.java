/*
* @Question https://leetcode.com/problems/reverse-linked-list/
* @Level EASY
*/
public class ReverseLinkedList {
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public ListNode reverseList(ListNode head) {
        ListNode prev=null,curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public static void main(String[] args) {
        // Tests
        ReverseLinkedList obj=new ReverseLinkedList();

        ListNode node=new ListNode(1);
        node.next=new ListNode(2);
        node.next.next=new ListNode(3);
        node.next.next.next=new ListNode(4);
        node.next.next.next.next=new ListNode(5);
        System.out.println("INPUT: "+printList(node));
        node=obj.reverseList(node);
        System.out.println("OUTPUT: "+printList(node));

        node=new ListNode(1);
        node.next=new ListNode(2);
        System.out.println("INPUT: "+printList(node));
        node=obj.reverseList(node);
        System.out.println("OUTPUT: "+printList(node));

        node=null;
        System.out.println("INPUT: NULL");
        node=obj.reverseList(node);
        System.out.println("OUTPUT: "+printList(node));
    }

    public static String printList(ListNode head){
        String result="";
        while (head!=null) {
            result+=head.val+"->";
            head=head.next;
        }
        result+="NULL";
        return result;
    }

    //Helper class
    static class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
