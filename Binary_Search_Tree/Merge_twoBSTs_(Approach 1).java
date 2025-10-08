import java.util.*;

class BST{
    public static class Node{
        int data;
        Node  left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }
    public static void getInorder(Node root,List<Integer>arr){
        if(root==null){
            return;
        }
        getInorder(root.left,arr);
        arr.add(root.data);
        getInorder(root.right,arr);
    }
    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static Node createBST(List<Integer>arr,int st, int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(arr.get(mid));
        root.left=createBST(arr,st,mid-1);
        root.right=createBST(arr,mid+1,end);
        return root;
    }
    public static Node mergeBSTs(Node root1,Node root2){
        List<Integer>arr=new ArrayList<>();
        getInorder(root1,arr);
        getInorder(root2,arr);

        Collections.sort(arr);

        return createBST(arr,0,arr.size()-1);
    }
    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);


        Node root2 = new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);

        Node merged = mergeBSTs(root1, root2);
        System.out.print("merged balanced BST:");
        preorder(merged);

    }

}