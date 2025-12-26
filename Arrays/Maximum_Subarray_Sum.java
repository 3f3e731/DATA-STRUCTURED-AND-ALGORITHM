import java.util.*;
class Main{
    public static int maxSubarray(int[]arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum>max){
                    max=sum;
                }
            }
        }
        return max;
    }
    public static int maxSubarrayKadane(int[]arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<n;i++){
            currSum+=arr[i];
            max=Math.max(max,currSum);

            if(currSum<0){
                currSum=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int []arr={2,3,5,-2,7,-4};

        System.out.println(maxSubarray(arr));
        System.out.println(maxSubarrayKadane(arr));
    }
}