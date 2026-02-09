import java.util.*;
class Main{
    public static int upperBound(int[] arr, int target) {
        int n=arr.length;
        int start=0,end=n-1;
        int ans=n;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]>target){
                ans=mid;
                end=mid-1;
            }
            else{
                start=start+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr={2, 3, 7, 10, 11, 11, 25};
        int target=9;
        System.out.println(upperBound(arr,target));
    }
}