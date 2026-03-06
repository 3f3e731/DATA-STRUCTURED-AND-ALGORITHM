import java.util.*;

public class Main{
    public static long subArrayRanges(int[] nums) {
        int n=nums.length;
        Stack<Integer>s=new Stack<>();

        int[]nextGre=new int[n];
        int[]nextSma=new int[n];
        int[]nextprevGre=new int[n];
        int[]nextprevSma=new int[n];

        //next Greater
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && nums[i]>nums[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGre[i]=n-i;
            }
            else{
                nextGre[i]=s.peek()-i;
            }
            s.push(i);
        }

        s.clear();

        //next Smaller
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && nums[i]<nums[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSma[i]=n-i;
            }
            else{
                nextSma[i]=s.peek()-i;
            }
            s.push(i);
        }

        s.clear();

        //next previous Greater
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && nums[i]>=nums[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nextprevGre[i]=i+1;
            }
            else{
                nextprevGre[i]=i-s.peek();
            }
            s.push(i);
        }

        s.clear();

        //next previous Smaller
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && nums[i]<=nums[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nextprevSma[i]=i+1;
            }
            else{
                nextprevSma[i]=i-s.peek();
            }
            s.push(i);
        }

        long minSum=0,maxSum=0;

        for(int i=0;i<n;i++){
            maxSum+=(long)nums[i]*nextGre[i]*nextprevGre[i];
            minSum+=(long)nums[i]*nextSma[i]*nextprevSma[i];
        }
        return maxSum-minSum;
    }
    public static void main(String[] args) {
        int []arr={1,2,3};
        long sum=subArrayRanges(arr);
        System.out.println(sum);
    }
}