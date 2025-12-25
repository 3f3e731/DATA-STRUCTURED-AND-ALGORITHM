import java.util.*;
class Main{
    public static void reverseArray(int []nums,int i, int j){
        if(i>=j) return;

        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

        reverseArray(nums,i+1,j-1);
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        int k=3;
        reverseArray(nums,0,nums.length-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}