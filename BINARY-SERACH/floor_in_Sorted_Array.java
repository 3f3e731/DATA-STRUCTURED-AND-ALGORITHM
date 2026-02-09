import java.util.*;
class Main{
    public static int findFloor(int[] arr, int x) {
        int n=arr.length;

        int start=0,end=n-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]<=x){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr={1, 2, 8, 10, 10, 12, 19};
        int target=5;
        System.out.println(findFloor(arr,target));
    }
}