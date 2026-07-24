import java.util.*;

public class Main {
    static class Node{
        Node left;
        Node right;
    }

    public static Node root=new Node();

    public static void insert(int num){
        Node curr=root;
        for(int i=31;i>=0;i--){
            int bit=(num>>i)&1;

            if(bit==0){
                if(curr.left==null){
                    curr.left=new Node();
                }
                curr=curr.left;
            }
            else{
                if(curr.right==null){
                    curr.right=new Node();
                }
                curr=curr.right;
            }

        }
    }
    public static int getMaxXor(int num){
        Node curr=root;
        int maxXor=0;

        for(int i=31;i>=0;i--){
            int bit=(num>>i)&1;

            if(bit==0){
                if(curr.right!=null){
                    maxXor|=(1<<i);
                    curr=curr.right;
                }
                else{
                    curr=curr.left;
                }
            }
            else{
                if(curr.left!=null){
                    maxXor|=(1<<i);
                    curr=curr.left;
                }
                else{
                    curr=curr.right;
                }
            }
        }
        return maxXor;
    }
    public static int findMaximumXOR(int[] nums) {
        for(int num:nums){
            insert(num);
        }

        int ans=0;

        for(int num:nums){
            ans=Math.max(ans,getMaxXor(num));
        }
        return ans;
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[]nums={3,10,5,25,2,8};
        System.out.print(findMaximumXOR(nums));
    }
}
