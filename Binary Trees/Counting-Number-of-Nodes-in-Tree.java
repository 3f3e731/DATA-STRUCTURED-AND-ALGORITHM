import java.util.*;

public class Main {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }

    public static int countNode(Node root){
        if(root==null) return 0;


        int lh=countNode(root.left);
        int rh=countNode(root.right);

        int treeCount=lh+rh+1;
        return treeCount;
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        System.out.println("count Of Tree Nodes:"+countNode(root));
    }
}