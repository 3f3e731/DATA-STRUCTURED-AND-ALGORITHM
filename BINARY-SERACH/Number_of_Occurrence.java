import java.util.*;
class Main{
    public static int firstIndex(int[]arr,int target){
        int n=arr.length;
        int start=0,end=n-1;
        int idx=-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]>=target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            if(arr[mid]==target){
                idx=mid;
            }
        }
        return idx;
    }
    public static int lastIndex(int[]arr,int target){
        int n=arr.length;
        int start=0,end=n-1;
        int idx=-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]<=target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            if(arr[mid]==target){
                idx=mid;
            }
        }
        return idx;
    }
    public static int countFreq(int[]arr,int target){
        int n=arr.length;
        int[]ans=new int[2];
        ans[0]=firstIndex(arr,target);
        if (ans[0]==-1) return 0;
        ans[1]=lastIndex(arr,target);
        return ans[1]-ans[0]+1;
    }
    public static void main(String[] args) {
        int[]arr={1, 1, 2, 2, 2, 2, 3};
        int target=2;
        System.out.println(countFreq(arr,target));
    }
}