import java.util.*;
class Main{
    public static int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int start=0,end=n-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=start+1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[]arr={1,3,5,6};
        int target=5;
        System.out.println(searchInsert(arr,target));
    }
}