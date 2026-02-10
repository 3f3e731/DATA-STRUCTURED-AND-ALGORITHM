import java.util.*;
class Main{
    public static int nthRoot(int n, int m) {
        int start=1,end=m;
        if(m==0) return m;
        while(start<=end){
            int mid=start+(end-start)/2;

            int ans=1;
            for(int i=0;i<n;i++){
                ans=ans*mid;
                if(ans>m) break;
            }

            if(ans==m){
                return mid;
            }
            else if(ans<m){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n=3,m=8;
        System.out.println(nthRoot(n,m));
    }
}