import java.util.*;

class Main{
    public static int countSubsequence(int[]nums,int i,int k,int sum){
        if(sum==0){
            return 1;
        }
        if(sum<0 || i==nums.length){
            return 0;
        }
        int count=0;
        count+=countSubsequence(nums,i+1,k,sum-nums[i]);
        count+=countSubsequence(nums,i+1,k,sum);
        return count;
    }
    public static void main(String[] args){
        int[]nums={4, 9, 2, 5, 1};
        int k=10;

        System.out.println(countSubsequence(nums,0,k,k));
    }
}