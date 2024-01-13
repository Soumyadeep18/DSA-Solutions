/*
* @Question https://leetcode.com/problems/merge-two-sorted-lists/
* @Level EASY
*/
public class MergeTwoSortedLists {
    // Time Complexity: O(M+N)
    // Space Complexity: O(1)
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;

        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                tail.next=list1;
                list1=list1.next;
            }
            else{
                tail.next=list2;
                list2=list2.next;
            }
            tail=tail.next;
        }

        while (list1!=null) {
            tail.next=list1;
            list1=list1.next;
            tail=tail.next;
        }

        while (list2!=null) {
            tail.next=list2;
            list2=list2.next;
            tail=tail.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        // Tests
        MergeTwoSortedLists obj=new MergeTwoSortedLists();

        ListNode node1=new ListNode(1);
        node1.next=new ListNode(2);
        node1.next.next=new ListNode(4);

        ListNode node2=new ListNode(1);
        node2.next=new ListNode(3);
        node2.next.next=new ListNode(4);
        
        System.out.println("INPUT 1: "+printList(node1));
        System.out.println("INPUT 2: "+printList(node2));

        ListNode node=obj.mergeTwoLists(node1, node2);
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
