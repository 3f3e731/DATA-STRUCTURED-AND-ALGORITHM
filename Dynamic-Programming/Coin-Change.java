import java.util.*;

public class Main {
    //Tabulation
    public static int coinChange(int []coin,int sum){
        int n=coin.length;
        int [][]dpTab=new int[n+1][sum+1];

        for(int i=0;i<dpTab.length;i++){
            dpTab[i][0]=1;
        }
        for(int j=0;j<dpTab[0].length;j++){
            dpTab[0][j]=0;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(coin[i-1]<=j){
                    dpTab[i][j]=dpTab[i][j-coin[i-1]]+dpTab[i-1][j];
                }
                else{
                    dpTab[i][j]=dpTab[i-1][j];
                }
            }
        }
        return dpTab[n][sum];
    }

    public static void main(String[] args) {
        int[] coin={1,2,3};
        int sum=4;
        System.out.println(coinChange(coin,sum));
    }
}