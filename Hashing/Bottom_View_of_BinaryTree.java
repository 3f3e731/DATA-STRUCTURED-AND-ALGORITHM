import java.util.*;
class Hashing{
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
    static class pair{
        Node node;
        int hd;
        pair(Node n,int hd){
            node=n;
            this.hd=hd;
        }
    }
    public static List<Integer> bottomView(Node root){
        if(root==null) return Collections.emptyList();

        TreeMap<Integer,Integer>map=new TreeMap<>();

        Queue<pair>q=new LinkedList<>();
        q.add(new pair(root, 0));

        while(!q.isEmpty()){
            pair p=q.poll();
            Node node=p.node;
            int hd=p.hd;

            map.put(hd,node.data);

            if(node.left!=null){
                q.add(new pair(node.left,hd-1));
            }
            if(node.right!=null){
                q.add(new pair(node.right,hd+1));
            }
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        Node root=new Node(20);
        root.left=new Node(8);
        root.right=new Node(22);
        root.left.left=new Node(5);
        root.left.right=new Node(3);
        root.right.right=new Node(25);
        root.left.right.left=new Node(10);
        root.left.right.right=new Node(14);
        
        System.out.println(bottomView(root));
    }
}