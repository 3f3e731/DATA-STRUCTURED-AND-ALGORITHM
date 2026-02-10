import java.util.*;
class Main{
    public static boolean kalegaKela(int[]arr, int k, int mid){
        int n=arr.length;
        int actualhours=0;

        for(int i=0;i<n;i++){
            actualhours+=(arr[i]+mid-1)/mid;
            if(actualhours>k){
                return false;
            }
        }
        return actualhours<=k;
    }
    public static int kokoEatingBanana(int[]arr,int k){
        int n=arr.length;

        int start=1;

        int max=0;
        for(int x:arr){
            max=Math.max(x,max);
        }
        int end=max;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(kalegaKela(arr,k,mid)){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[]arr={3,6,7,11};
        int k=8;
        System.out.println(kokoEatingBanana(arr,k));
    }
}