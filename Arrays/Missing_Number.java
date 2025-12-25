import java.util.*;
class Main{
    //Brute Force
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]!=0) {
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]+1){
                return nums[i-1]+1;
            }
        }
        return nums[nums.length-1]+1;
    }
    //Optimal
    public static int missingNumberOpti(int[] nums) {
        int n=nums.length;
        int total=n*(n+1)/2;
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        return total-sum;
    }
    public static void main(String[] args) {
        int nums[]={3,0,1};
        System.out.println(missingNumber(nums));
        System.out.println(missingNumberOpti(nums));

    }
}