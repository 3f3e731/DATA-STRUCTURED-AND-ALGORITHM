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
    public static boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secHead=slow.next;
        slow.next=null;

        ListNode prev=null;
        ListNode curr=secHead;
        ListNode next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        ListNode t1=head;
        ListNode t2=prev;

        while(t2!=null){
            if(t1.val!=t2.val){
                return false;
            }
            t1=t1.next;
            t2=t2.next;
        }
        return true;
    }
    public static ListNode arrayToLinkedlist(int[]arr){
        if(arr.length==0){
            return null;
        }
        ListNode head=new ListNode(arr[0]);
        ListNode tail=head;

        for(int i=1;i<arr.length;i++){
            tail.next=new ListNode(arr[i]);
            tail=tail.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[]arr={1,2,2,1};

        ListNode head=arrayToLinkedlist(arr);
        System.out.println(isPalindrome(head));
    }
}