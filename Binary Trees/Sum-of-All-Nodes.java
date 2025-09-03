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

    //BFS
    public static int Sum1(Node root){
        Queue<Node>q=new LinkedList<>();

        q.add(root);

        int total=0;

        while(!q.isEmpty()){
            Node currNode=q.remove();
            total=total+currNode.data;
            if(currNode.left!=null){
                q.add(currNode.left);
            }
            if(currNode.right!=null){
                q.add(currNode.right);
            }
        }
        return total;
    }

    //DFS
    public static int Sum2(Node root) {
        if (root == null) return 0;
        return root.data + Sum2(root.left) + Sum2(root.right);
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        System.out.println("Sum of all Nodes:"+Sum1(root));//BFS
        System.out.println("Sum of all Nodes:"+Sum2(root));//DFS
    }
}