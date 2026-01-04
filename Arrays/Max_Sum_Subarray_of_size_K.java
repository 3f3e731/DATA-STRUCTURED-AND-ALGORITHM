import java.util.*;
class Main{
    //Brute Force
    public static int maxSubarraySum(int[] arr, int k) {
        int n=arr.length;
        int max=0;
        for(int i=0;i<=n-k;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=arr[j];
            }
            max=Math.max(max,sum);
        }
        return max;
    }
    //Optimal
    public static int maxSubarraySumOpti(int[] arr, int k) {
        int n=arr.length;
        int max_sum=0;
        int window_sum=0;
        for(int i=0;i<k;i++){
            window_sum+=arr[i];
        }
        max_sum=window_sum;
        for(int j=k;j<n;j++){
            window_sum+=arr[j]-arr[j-k];
            max_sum=Math.max(max_sum,window_sum);
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int arr[] = {100, 200, 300, 400};
        int k = 2;
        System.out.println(maxSubarraySum(arr,k));
        System.out.println(maxSubarraySumOpti(arr,k));
    }
}