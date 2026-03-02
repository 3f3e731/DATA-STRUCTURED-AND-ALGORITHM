import java.util.*;

public class Main{
    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        ListNode temp1=headA;
        ListNode temp2=headB;

        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;

            if(temp1==temp2){
                return temp1;
            }

            if(temp1==null){
                temp1=headB;
            }
            if(temp2==null){
                temp2=headA;
            }
        }
        return temp1;
    }
    public static void main(String[] args) {
        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        ListNode head1 = new ListNode(4);
        head1.next = new ListNode(1);
        head1.next.next = common;

        ListNode head2 = new ListNode(5);
        head2.next = new ListNode(6);
        head2.next.next = new ListNode(1);
        head2.next.next.next = common;

        System.out.println(getIntersectionNode(head1,head2).val);
    }
}