import java.util.*;
public class Main {
    //Brute-Force
    public static int inversionCount(int[]arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
    
    //Optimal
    public static int mergeSort(int[]arr, int si, int ei){
        if(si<ei) {
            int mid=si+(ei-si)/2;
            int leftInversion=mergeSort(arr,si,mid);
            int rightInversion=mergeSort(arr,mid+1,ei);

            int invCount=merge(arr,si,mid,ei);

            return leftInversion+rightInversion+invCount;
        }
        return 0;
    }
    public static int merge(int[]arr, int si, int mid, int ei){
        int[]temp=new int[ei-si+1];
        int i=si, j=mid+1,k=0;
        int invCount=0;

        while(i<=mid && j<=ei){
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount+=mid-i+1;
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
        return invCount;
    }
    public static void main(String args[]) {
        int[] arr = {1,3,5,10,2,6,8,9};
        System.out.println(inversionCount(arr));

        System.out.println(mergeSort(arr,0,arr.length-1));
    }
}