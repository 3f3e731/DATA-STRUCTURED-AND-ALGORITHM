import org.w3c.dom.ls.LSOutput;

import java.util.*;
class BinaryTreeB {
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
    //DFS
    public static void kLevel(Node root, int level, int k){
        if(root==null) return;
        if(level==k){
            System.out.print(root.data+" ");
            return;
        }

        kLevel(root.left,level+1,k);
        kLevel(root.right,level+1,k);
    }
    
    //BFS
    public static void Klevel(Node root, int k){
        int count=1;
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                    count++;
                }
            }
            else{
                if(count==k){
                    System.out.print(curr.data+" ");
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }

    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        kLevel(root,1,3);
        System.out.println();
        Klevel(root,3);

    }

}