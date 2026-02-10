import java.util.*;
class Main{
    public static int bSearch(int x){
        int start=1,end=x/2;
        int ans=0;
        if(x==1 || x==0) return x;
        while(start<=end){
            int mid=start+(end-start)/2;
            if((long)mid*mid<=x){
                ans=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=11;
        int x=4;
        System.out.println(bSearch(n));
        System.out.println(bSearch(x));
    }
}