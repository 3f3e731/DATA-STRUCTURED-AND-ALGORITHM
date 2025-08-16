import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[]arr={14,33,27,10};
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int curr=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[curr]){
                    curr=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[curr];
            arr[curr]=temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}