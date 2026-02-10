import java.util.*;
class Main{
    public static boolean ispossible(int[]arr,int mid, int cows){
        int n=arr.length;
        int count=1;
        int lastStallPos=arr[0];
        for(int i=1;i<n;i++){
            if((arr[i]-lastStallPos)>=mid){
                count++;
                lastStallPos=arr[i];
            }
            if(cows==count){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int N=5;
        int[]arr={1,2,8,4,9};
        int cows=3;

        int n=arr.length;
        Arrays.sort(arr);

        int l=1;
        int r=arr[arr.length-1]-arr[0];
        int ans=0;
        while(l<=r){
            int mid=l+(r-l)/2;

            if(ispossible(arr,mid,cows)){
                ans=mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        System.out.println(ans);
    }
}