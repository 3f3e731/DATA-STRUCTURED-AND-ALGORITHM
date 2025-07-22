import java.util.*;

public class Main {
    //Recursion
    public static int catalanNumber(int n){
        if(n==0 || n==1){
            return 1;
        }
        int ans=0;
        for(int i=0;i<=n-1;i++){
            ans+=catalanNumber(i)*catalanNumber(n-i-1);
        }
        return ans;
    }

    //Memoization
    public static int catalanNumberMemo(int n, int []dpMemo){
        if(n==0 || n==1){
            return 1;
        }
        if(dpMemo[n]!=-1){
            return dpMemo[n];
        }
        int ans=0;
        for(int i=0;i<=n-1;i++){
            ans+=catalanNumberMemo(i,dpMemo)*catalanNumberMemo(n-i-1,dpMemo);
        }
        return dpMemo[n]=ans;
    }

    //Tabulation
    public static int catalanNumberTab(int n){
        int[]dpTab=new int[n+1];
        dpTab[0]=dpTab[1]=1;

        int ans=0;
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                dpTab[i]+=dpTab[j]*dpTab[i-j-1];
            }
        }
        return dpTab[n];
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(catalanNumber(n));

        int[]dpMemo=new int[n+1];
        Arrays.fill(dpMemo,-1);
        System.out.println(catalanNumberMemo(n,dpMemo));

        System.out.println(catalanNumberTab(n));
    }
}