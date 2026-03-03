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
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static ListNode addOneInLinkedlist(ListNode head){
        head=reverse(head);

        ListNode curr=head;
        ListNode prev=head;

        int sum=curr.val+1;
        curr.val=sum%10;
        int carry=sum/10;

        curr=curr.next;

        while(curr!=null){
            sum=curr.val+carry;
            curr.val=sum%10;
            carry=sum/10;

            prev=curr;
            curr=curr.next;
        }

        if(carry!=0){
            prev.next=new ListNode(carry);
        }
        head=reverse(head);

        return head;
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
    public static void print(ListNode head){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        int[]arr1={9,9,9};

        ListNode head= arrayToLinkedlist(arr1);

        head= addOneInLinkedlist(head);
        print(head);
    }
}