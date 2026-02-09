import java.util.*;
class Main{
    public static int firstIndex(int[]arr,int target){
        int n=arr.length;
        int idx=-1;
        int start=0,end=n-1;
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
        int idx=-1;
        int start=0,end=n-1;
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
    public static void main(String[] args) {
        int[]arr={5,7,7,8,8,10};
        int target=8;
        int n=arr.length;
        int []ans=new int[2];
        ans[0]=firstIndex(arr,target);
        ans[1]=lastIndex(arr,target);
        System.out.println(Arrays.toString(ans));
    }
}