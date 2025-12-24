import java.util.Arrays;

public class Main {
    //Brute-Force
    public static void reverseArray(int []arr, int idx,int []ans){
        if(idx<0){
            return;
        }
        ans[arr.length-1-idx]=arr[idx];
        reverseArray(arr,idx-1,ans);
    }
    //Optimize
    public static void reverseArr(int[]arr,int left, int right){
        if(left>=right){
            return;
        }
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

        reverseArr(arr,left+1,right-1);
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int []ans=new int[arr.length];
        reverseArray(arr,arr.length-1,ans);
        System.out.println(Arrays.toString(ans));

        reverseArr(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

