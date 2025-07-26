import java.util.*;

public class Main {
    public static void Subsets(String str,String ans,int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        Subsets(str,ans+str.charAt(i),i+1);//yes
        Subsets(str,ans,i+1);//no
    }
    public static void printArr(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        String str="abc";
        Subsets(str,"",0);
    }
}