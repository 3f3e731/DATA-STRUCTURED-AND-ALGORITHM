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
        int nums[]={1,2,3,4,5};
        reverseArray(nums,0,nums.length-1);
        reverseArray(nums,0,nums.length-2);
        System.out.println(Arrays.toString(nums));
    }
}