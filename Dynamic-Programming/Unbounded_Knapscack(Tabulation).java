import java.util.*;

public class Main {
    //Tabulation
    public static int unboundedKnapsackTab(int []val, int []wt, int W){
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
                    int incProfit=v+dpTab[i][j-w];
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
        System.out.println(unboundedKnapsackTab(val,wt,W));
    }
}