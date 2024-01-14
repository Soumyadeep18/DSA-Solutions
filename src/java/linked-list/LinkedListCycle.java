/*
* @Question https://leetcode.com/problems/linked-list-cycle/
* @Level EASY
*/
public class LinkedListCycle {
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)
            return false;
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        //Tests
        LinkedListCycle obj=new LinkedListCycle();

        ListNode node=new ListNode(3);
        node.next=new ListNode(2);
        node.next.next=new ListNode(0);
        node.next.next.next=new ListNode(-4);
        node.next.next.next.next=node.next;
        System.out.println(obj.hasCycle(node));

        node=new ListNode(1);
        node.next=new ListNode(2);
        node.next.next=node;
        System.out.println(obj.hasCycle(node));

        node=new ListNode(1);
        System.out.println(obj.hasCycle(node));
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
