import java.util.*;

public class Main{
    public static void maxArea(int[]arr){
        int n=arr.length;
        int maxArea=0;
        int[]nsl=new int[n];
        int[]nsr=new int[n];

        //next smaller right
        Stack<Integer>s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        //next smaller left
        s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        for(int i=0;i<n;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=height*width;
            maxArea=Math.max(maxArea,currArea);
        }
        System.out.println("Max Area in Histogram="+maxArea);
    }
    
    public static void main(String[] args) {
        int[]arr={2,1,5,6,2,3};
        maxArea(arr);
    }
}