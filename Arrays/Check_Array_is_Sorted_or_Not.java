import java.util.*;
class Main{
    //Super-Brute-Force
    public static boolean checkSorted(int[]nums){
        int rotation=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                rotation=i;
                break;
            }
        }
        int[]sorted=new int[n];
        int idx=0;
        for(int j=rotation;j<n;j++){
            sorted[idx]=nums[j];
            idx++;
        }
        for(int k=0;k<rotation;k++){
            sorted[idx]=nums[k];
            idx++;
        }

        for(int i=1;i<sorted.length;i++){
            if(sorted[i]<sorted[i-1]){
                return false;
            }
        }
        return true;
    }
    //Advanced Brute Force
    public static boolean checkSortedAdvanced(int[]nums){
        int rotation=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                rotation=i;
                break;
            }
        }
        int[]sorted=new int[n];
        int idx=0;
        for(int i=0;i<nums.length;i++){
            sorted[idx++]=nums[(i+rotation)%n];
        }

        for(int i=1;i<sorted.length;i++){
            if(sorted[i]<sorted[i-1]){
                return false;
            }
        }
        return true;
    }
    //Optimal
    public static boolean checkSortedOptimal(int[]nums){
        int peek=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%n]){
                peek++;
            }
        }
        return peek<=1;
    }
    public static void main(String[] args) {
        int nums[]={3,4,5,1,2};
        System.out.println(checkSorted(nums));
        System.out.println(checkSortedAdvanced(nums));
        System.out.println(checkSortedOptimal(nums));
    }
}