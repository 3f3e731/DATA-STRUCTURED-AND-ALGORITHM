import java.util.*;

public class Main {
    public static void isOccurrences(int[]arr, int key, int n){
        if(arr[n]==key){
            System.out.print(n+" ");
        }
        if(n==arr.length-1){
            return;
        }
        isOccurrences(arr,key,n+1);

    }
    public static void main(String[] args) {
        int[]arr={3,2,4,5,6,2,7,2,2};
        int key=2;
        isOccurrences(arr,key,0);
    }
}