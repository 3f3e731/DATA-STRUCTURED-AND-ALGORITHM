import java.util.*;

public class Main {
    //Recursion
    public static int knapsack(int[]val, int[]wt, int W, int i){
        if(W==0 || i==0){
            return 0;
        }
        if(wt[i-1]<=W){
            //include
            int ans1=val[i-1]+knapsack(val,wt,W-wt[i-1],i-1);
            //exclude
            int ans2=knapsack(val,wt,W,i-1);
            return Math.max(ans1,ans2);
        }
        else{
            return knapsack(val,wt,W,i-1);
        }
    }

    //Memoization
    public static int knapsackMemo(int[]val, int[]wt, int W, int i, int [][]dpMemo){
        if(W==0 || i==0){
            return 0;
        }
        if(dpMemo[i][W]!=-1){
            return dpMemo[i][W];
        }
        if(wt[i-1]<=W){
            //include
            int ans1=val[i-1]+knapsackMemo(val,wt,W-wt[i-1],i-1,dpMemo);
            //exclude
            int ans2=knapsackMemo(val,wt,W,i-1,dpMemo);
            dpMemo[i][W]=Math.max(ans1,ans2);
            return dpMemo[i][W];
        }
        else{
            dpMemo[i][W]=knapsackMemo(val,wt,W,i-1,dpMemo);
            return dpMemo[i][W];
        }
    }

    //Tabulation
    public static int knapsackTab(int []val, int []wt, int W){
        int n=val.length;
        int [][]dpTab=new int[n+1][W+1];

        for(int i=0;i<dpTab.length;i++){
            dpTab[i][0]=0;
        }
        for(int j=0;j<dpTab[0].length;j++){
            dpTab[0][j]=0;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                int v=val[i-1];
                int w=wt[i-1];

                if(w<=j){
                    int incProfit=v+dpTab[i-1][j-w];
                    int excProfit=dpTab[i-1][j];
                    dpTab[i][j]=Math.max(incProfit,excProfit);
                }
                else{
                    int excProfit=dpTab[i-1][j];
                    dpTab[i][j]=excProfit;
                }
            }
        }
        return dpTab[n][W];
    }
    
    public static void main(String[] args) {
        int[] val={15,14,10,45,30};
        int[] wt={2,5,1,3,4};
        int W=7;
        System.out.println(knapsack(val,wt,W,val.length));

        int[][]dpMemo=new int[val.length+1][W+1];
        for(int i=0;i<dpMemo.length;i++){
            for(int j=0;j<dpMemo[0].length;j++){
                dpMemo[i][j]=-1;
            }
        }
        System.out.println(knapsackMemo(val,wt,W,val.length,dpMemo));


        System.out.println(knapsackTab(val,wt,W));
    }
}