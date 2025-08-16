import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[]arr={14,33,27,10};
        int n=arr.length;
        
        for(int i=0;i<n-1;i++){
            boolean isSort=false;
            
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSort=true;
                }
            }
            if(!isSort){
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}