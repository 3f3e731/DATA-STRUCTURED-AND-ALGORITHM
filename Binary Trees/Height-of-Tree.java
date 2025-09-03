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

    public static int Height(Node root){
        if(root==null) return 0;

        int MaxHeight=0;

        int lh=Height(root.left);
        int rh=Height(root.right);

        MaxHeight=Math.max(lh,rh)+1;
        return MaxHeight;
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        System.out.println("Height Of Tree:"+Height(root));
    }
}