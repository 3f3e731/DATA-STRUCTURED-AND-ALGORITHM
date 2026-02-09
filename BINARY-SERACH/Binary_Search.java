import java.util.*;
class Main{
    public static int search(int[] nums, int target) {
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
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr={-1,0,3,5,9,12};
        int target=9;
        System.out.println(search(arr,target));
    }
}