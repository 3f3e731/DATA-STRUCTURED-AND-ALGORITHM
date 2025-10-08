import java.util.*;

class BST{
    public static class Node{
        int val;
        Node  left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    }
    public static int rangeSumBST(Node root, int low, int high) {
        if(root==null) return 0;

        int sum=0;
        if(root.val>=low && root.val<=high){
            sum+=root.val;
            sum+=rangeSumBST(root.left,low,high);
            sum+=rangeSumBST(root.right,low,high);
        }
        else if(root.val<low){
            sum+=rangeSumBST(root.right,low,high);
        }
        else{
            sum+=rangeSumBST(root.left,low,high);
        }
        return sum;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.left.right=new Node(7);

        root.right=new Node(15);
        root.right.right=new Node(18);

        int result=rangeSumBST(root,7,15);
        System.out.println(result);
    }
}