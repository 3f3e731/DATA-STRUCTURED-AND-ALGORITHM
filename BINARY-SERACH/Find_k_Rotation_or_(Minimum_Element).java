import java.util.*;
class Main{
    public static int findKRotation(int arr[]) {
        int n=arr.length;
        int i=0,j=n-1;

        while(i<=j){
            int mid=i+(j-i)/2;

            if(arr[mid]<arr[j]){
                j=mid;
            }
            else{
                i=mid+1;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int[]arr={5, 1, 2, 3, 4};
        System.out.println(findKRotation(arr));
    }
}