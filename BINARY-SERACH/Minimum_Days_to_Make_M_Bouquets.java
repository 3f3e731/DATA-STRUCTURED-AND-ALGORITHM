import java.util.*;
class Main{
    public static boolean mBouquetsBanJange(int[]bloomDay, int mid, int m , int k){
        int Kcount=0, bookie=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                Kcount++;
                if(Kcount==k){
                    bookie++;
                    if(bookie>=m) return true;
                    Kcount=0;
                }
            }
            else{
                Kcount=0;
            }
        }
        return false;
    }
    public static int minDays(int[]bloomDay, int k, int m){
        int start=1,end=0;
        if((long)m*k>bloomDay.length) return -1;
        for(int x:bloomDay){
            end=Math.max(end,x);
        }

        while(start<=end){
            int mid=start+(end-start)/2;

            if(mBouquetsBanJange(bloomDay,mid,m,k)){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[]arr={3, 4, 2, 7, 13, 8, 5};
        int m=3;
        int k=2;
        System.out.println(minDays(arr,k,m));
    }
}