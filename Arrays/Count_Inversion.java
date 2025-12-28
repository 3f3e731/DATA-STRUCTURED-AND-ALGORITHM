import java.util.*;
class Main{
    //Brute Force
    public static int countInversion(int[]arr){
        int count=0;
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
    //Optimal
    public static int merge(int []arr, int i, int mid, int j){
        int left=i,right=mid+1,k=0;

        int inversionCount=0;

        int temp[]=new int[j-i+1];
        while(left<=mid && right<=j){
            if(arr[left]<=arr[right]){
                temp[k++]=arr[left++];
            }
            else{
                temp[k++]=arr[right++];
                inversionCount+=mid-left+1;
            }
        }
        while(left<=mid){
            temp[k++]=arr[left++];
        }
        while(right<=j){
            temp[k++]=arr[right++];
        }
        for(int x=0;x<temp.length;x++){
            arr[i+x]=temp[x];
        }
        return inversionCount;
    }
    public static int mergeSort(int []arr,int i, int j){
        if(i<j){
            int mid=i+(j-i)/2;

            int leftCount=mergeSort(arr,i,mid);
            int rightCount=mergeSort(arr,mid+1,j);

            int invCount=merge(arr,i,mid,j);
            return leftCount+rightCount+invCount;
        }
        return 0;
    }
    public static void main(String[] args) {
        int []arr={6,3,5,2,7};
        System.out.println(countInversion(arr));

        System.out.println(mergeSort(arr,0,arr.length-1));
    }
}