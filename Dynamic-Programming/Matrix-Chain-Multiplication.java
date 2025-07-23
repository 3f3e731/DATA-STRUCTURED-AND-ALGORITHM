import java.util.*;

public class Main {
    //Recursion
    public static int mcm(int []arr, int i, int j){
        if(i==j){
            return 0;
        }
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int cost1=mcm(arr,i,k);
            int cost2=mcm(arr,k+1,j);
            int cost3=arr[i-1]*arr[k]*arr[j];
            int finalCost=cost1+cost2+cost3;
            ans=Math.min(ans,finalCost);
        }
        return ans;
    }

    //Memoization
    public static int mcmMemo(int []arr, int i, int j, int[][]dpMemo){
        if(i==j){
            return 0;
        }
        if(dpMemo[i][j]!=-1){
            return dpMemo[i][j];
        }
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int cost1=mcmMemo(arr,i,k,dpMemo);
            int cost2=mcmMemo(arr,k+1,j,dpMemo);
            int cost3=arr[i-1]*arr[k]*arr[j];
            int finalCost=cost1+cost2+cost3;
            ans=Math.min(ans,finalCost);
        }
        return dpMemo[i][j]=ans;
    }

    //Tabulation
    public static int mcmTab(int[]arr){
        int n=arr.length;
        int[][]dpTab=new int[n][n];

        for(int i=0;i<n;i++){
            dpTab[i][i]=0;
        }

        for(int len=2;len<=n-1;len++){
            for(int i=1;i<=n-len;i++){
                int j=i+len-1;
                dpTab[i][j]=Integer.MAX_VALUE;
                for(int k=i;k<=j-1;k++){
                    int cost1=dpTab[i][k];
                    int cost2=dpTab[k+1][j];
                    int cost3=arr[i-1]*arr[k]*arr[j];
                    int finalCost=cost1+cost2+cost3;
                    dpTab[i][j]=Math.min(dpTab[i][j],finalCost);
                }
            }
        }
        return dpTab[1][n-1];
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,3};
        int n=arr.length;
        System.out.println(mcm(arr,1,n-1));

        int[][]dpMemo=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dpMemo[i],-1);
        }
        System.out.println(mcmMemo(arr,1,n-1,dpMemo));


        System.out.println(mcmTab(arr));
    }
}