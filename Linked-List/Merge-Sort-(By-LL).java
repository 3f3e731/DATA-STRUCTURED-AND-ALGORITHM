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
    public static ListNode getMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static ListNode merge(ListNode head1,ListNode head2){
        ListNode mergeLL=new ListNode(-1);
        ListNode temp=mergeLL;

        while(head1!=null && head2!=null){
            if(head1.val<=head2.val){
                temp.next=head1;
                head1=head1.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
            }
            temp=temp.next;
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }

        return mergeLL.next;
    }
    public static ListNode mergeSort(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=getMid(head);
        ListNode secHead=mid.next;
        mid.next=null;

        ListNode L1=mergeSort(head);
        ListNode L2=mergeSort(secHead);

        return merge(L1,L2);
    }
    public static ListNode sortList(ListNode head) {
        head=mergeSort(head);
        return head;
    }
    public static void printLL(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
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
        int[]arr={1,5,8,3,2};
        ListNode head=arrayToLinkedList(arr);

        System.out.println("-----Before Sorting-----");
        printLL(head);
        System.out.println("------After Sorting-----");
        sortList(head);
        printLL(head);
    }
}
