import java.util.*;
class Main{
    public static void main(String[] args) {
        int arr[]={1,2,4,7,7,5};
        int max=Integer.MIN_VALUE,secMax=Integer.MIN_VALUE,min=Integer.MAX_VALUE,secMin=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            }
            else if(arr[i]!=max && arr[i]>secMax){
                secMax=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                secMin=min;
                min=arr[i];
            }
            else if(arr[i]!=min && arr[i]<secMin){
                secMin=arr[i];
            }
        }
        System.out.println(secMax);
        System.out.println(secMin);
    }
}