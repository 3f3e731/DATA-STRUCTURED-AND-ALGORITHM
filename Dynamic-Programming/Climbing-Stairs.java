import java.util.*;
public class Main {
    //Recursion
    public static int countWays(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        return countWays(n-1)+countWays(n-2);
    }

    //Memoization
    public static int countWaysMemoization(int n,int[]dpMemo){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(dpMemo[n]!=-1){
            return dpMemo[n];
        }
        dpMemo[n]=countWaysMemoization(n-1,dpMemo)+countWaysMemoization(n-2,dpMemo);
        return dpMemo[n];
    }

    //Tabulation
    public static int countWaysTabulation(int n){
        int []dpTab=new int[n+1];
        dpTab[0]=1;

        for(int i=1;i<=n;i++){
            if(i==1){
                dpTab[i]=dpTab[i-1];
            }
            else{
                dpTab[i]=dpTab[i-1]+dpTab[i-2];
            }
        }
        return dpTab[n];
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(countWays(n));

        int []dpMemo=new int[n+1];
        Arrays.fill(dpMemo,-1);
        System.out.println(countWaysMemoization(n,dpMemo));


        System.out.println(countWaysTabulation(n));
    }
}