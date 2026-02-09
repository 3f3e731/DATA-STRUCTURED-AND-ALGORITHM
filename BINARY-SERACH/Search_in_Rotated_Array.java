import java.util.*;
class Main{
    public static int Bsearch(int[]arr,int k,int start,int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;

        if (arr[mid] == k) {
            return mid;
        }

        if (arr[start] <= arr[mid]) {
            if (arr[start] <= k && k <= arr[mid]) {
                return Bsearch(arr, k, start, mid - 1);
            } else {
                return Bsearch(arr, k, mid + 1, end);
            }
        } else {
            if (arr[mid] <= k && k <= arr[end]) {
                return Bsearch(arr, k, mid + 1, end);
            } else {
                return Bsearch(arr, k, start, mid - 1);
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(Bsearch(arr,target,0,arr.length-1));
    }
}