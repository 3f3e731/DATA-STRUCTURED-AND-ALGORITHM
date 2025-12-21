import java.util.*;

public class Main {
    public static int targetSum(int []arr, int target, int sum ,int i,int [][]dp){
        if(sum==target){
            return 1;
        }
        if(i==arr.length || sum>target){
            return 0;
        }
        if(dp[i][sum]!=-1){
            return dp[i][sum];
        }
        int ans1=targetSum(arr,target,sum+arr[i],i+1,dp);
        int ans2=targetSum(arr, target, sum, i+1,dp);
        dp[i][sum]= ans1+ans2;
        return dp[i][sum];

    }
    public static int targetSumTab(int[]arr, int target){
        int[][]dpTab=new int[arr.length+1][target+1];

        for(int i=0;i<dpTab.length;i++){
            dpTab[i][0]=1;
        }
        for(int i=1;i<dpTab[0].length;i++){
            dpTab[0][i]=0;
        }

        for(int i=1;i<arr.length+1;i++){
            for(int j=1;j<target+1;j++){
                dpTab[i][j]=dpTab[i-1][j];

                if(arr[i-1]<=j){
                    dpTab[i][j]=dpTab[i][j]+dpTab[i-1][j-arr[i-1]];
                }
            }
        }
        return dpTab[arr.length][target];
    }
    public static void main(String[] args) {
        int[] arr={4,2,7,1,3};
        int target=10;
        int [][]dp=new int[arr.length][target+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(targetSum(arr,target,0,0,dp));

        System.out.println(targetSumTab(arr,target));
    }
}
