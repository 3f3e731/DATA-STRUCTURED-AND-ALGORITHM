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
    public static ListNode removeElements(ListNode head, int val) {
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            if(curr!=null && curr.val==val){
                while(curr!=null && curr.val==val){
                    curr=curr.next;
                    if(prev!=null){
                        prev.next=curr;
                    }
                    else{
                        head=curr;
                    }
                }
            }
            else{
                prev=curr;
                curr=curr.next;
            }
        }
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
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[]arr={1,2,6,3,4,5,6};

        ListNode head=arrayToLinkedlist(arr);

        System.out.println("Before Remove Element");
        print(head);

        removeElements(head,6);
        
        System.out.println("After Remove Element");
        print(head);

    }
}