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
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static Node mirror(Node root){
        if(root==null) return null;

        Node leftSub=mirror(root.left);
        Node rightSub=mirror(root.right);

        root.left=rightSub;
        root.right=leftSub;

        return root;

    }
    public static void main(String[] args) {
        int values[]={8,5,10,3,6,11};
        Node root=null;

        for(int i=0;i< values.length;i++){
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println();

        mirror(root);

        preorder(root);
    }

}