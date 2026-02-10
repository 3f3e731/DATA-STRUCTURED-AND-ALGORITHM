import java.util.*;
class Main{
    public static boolean thresholdSeChotaHai(int[]nums, int threshold, int mid){
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=(int)Math.ceil((double)nums[i]/mid);
        }
        if(ans<=threshold){
            return true;
        }
        return false;
    }
    public static int SmallestDivisor(int[] nums, int threshold) {
        int start=1;
        int end=0;
        int result=0;
        for(int x:nums){
            end=Math.max(end,x);
        }
        while(start<=end){
            int mid=start+(end-start)/2;

            if(thresholdSeChotaHai(nums,threshold,mid)){
                result=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[]arr={1,2,5,9};
        int k=6;
        System.out.println(SmallestDivisor(arr,k));
    }
}