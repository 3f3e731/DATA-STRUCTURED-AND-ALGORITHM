import java.util.*;

public class Main{
    static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void reorderList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null){
            return;
        }
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secondHead=slow.next;
        slow.next=null;


        ListNode prev=null;
        ListNode curr=secondHead;
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
            ListNode m1=t1.next;
            ListNode m2=t2.next;
            t1.next=t2;
            t2.next=m1;
            t1=m1;
            t2=m2;
        }
    }
    public static void printLL(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static ListNode arrayToLinkedList(int[]arr){
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
        int[]arr={1,2,3,4};
        ListNode head=arrayToLinkedList(arr);

        System.out.println("-----Before Reorder-----");
        printLL(head);
        System.out.println("------After Reorder-----");
        reorderList(head);
        printLL(head);
    }
}