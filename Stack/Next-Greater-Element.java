import java.util.*;

public class Main{
    //Brute-Force
    public static void nextGreaterElement(int[]arr,int[]ans){
        for(int i=0;i<arr.length;i++){
            ans[i]=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    ans[i]=arr[j];
                    break;
                }
            }
        }
    }

    //Optimize
    public static void nextGreaterElementOptimize(int[]arr,int[]ans){
        Stack<Integer>s=new Stack<>();
        int n=arr.length;
        ans[n-1]=-1;
        s.push(n-1);

        for(int i=n-2;i>=0;i--){
            int curr=arr[i];
            while(!s.isEmpty() && curr>=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=arr[s.peek()];
            }
            s.push(i);
        }
    }

    public static void printNextGreaterElement(int []ans){
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[]arr={6,8,0,1,3};
        int []ans=new int[arr.length];

        nextGreaterElement(arr,ans);
        printNextGreaterElement(ans);

        System.out.println();

        nextGreaterElementOptimize(arr,ans);
        printNextGreaterElement(ans);


    }
}