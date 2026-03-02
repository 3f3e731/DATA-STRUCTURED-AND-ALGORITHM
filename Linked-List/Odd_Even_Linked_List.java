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
    public static ListNode oddEvenList(ListNode head) {
        ListNode oddDummy=new ListNode(-1);
        ListNode evenDummy=new ListNode(-1);

        ListNode odd=oddDummy;
        ListNode even=evenDummy;

        ListNode temp=head;
        int index=1;

        while(temp!=null){
            if(index%2==1){
                odd.next=temp;
                odd=odd.next;
            }
            else{
                even.next=temp;
                even=even.next;
            }
            temp=temp.next;
            index++;
        }

        odd.next = null;
        even.next = null;

        odd.next = evenDummy.next;

        return oddDummy.next;
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
        int[]arr={1,2,3,4,5};

        ListNode head=arrayToLinkedlist(arr);

        System.out.println("------Before Array-----");
        print(head);

        System.out.println("-----After Array-----");
        oddEvenList(head);
        print(head);
    }
}