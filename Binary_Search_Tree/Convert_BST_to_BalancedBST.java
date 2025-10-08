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
    public static Node insert(Node root,int arr){
        if(root==null){
            root=new Node(arr);
            return root;
        }
        if(root.data>arr){
            root.left=insert(root.left,arr);
        }
        else{
            root.right=insert(root.right,arr);
        }
        return root;
    }
    public static void getInorder(Node root,List<Integer>inorder){
        if(root==null){
            return;
        }
        getInorder(root.left,inorder);
        inorder.add(root.data);
        getInorder(root.right,inorder);
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static Node createBST(List<Integer>inorder,int st, int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(inorder.get(mid));
        root.left=createBST(inorder,st,mid-1);
        root.right=createBST(inorder,mid+1,end);
        return root;
    }
    public static Node balancedBST(Node root){
        List<Integer>inorder=new ArrayList<>();
        getInorder(root,inorder);

        root=createBST(inorder,0,inorder.size()-1);
        return root;
    }
    public static void main(String[] args) {
        int arr[]={8,6,5,3,10,11,12};
        Node root=null;
        for(int i=0;i<arr.length;i++){
            root=insert(root,arr[i]);
        }

        root=balancedBST(root);
        preorder(root);
    }

}