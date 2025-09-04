import java.util.*;
class Main {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Info{
        int Dia;
        int ht;
        Info(int Dia, int ht){
            this.Dia=Dia;
            this.ht=ht;
        }
    }
    public static Info Diameter(Node root){
        if(root==null) return new Info(0,0);
        Info leftDia=Diameter(root.left);
        Info rightDia=Diameter(root.right);

        int Dia=Math.max(Math.max(leftDia.Dia,rightDia.Dia),leftDia.ht+rightDia.ht+1);
        int ht=Math.max(leftDia.ht,rightDia.ht)+1;
        return new Info(Dia,ht);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        System.out.print("Diameter of tree:"+Diameter(root).Dia);
    }
}