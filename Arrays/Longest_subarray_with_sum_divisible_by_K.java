import java.util.*;
class Main{
    //Brute Force
    public static int longestSubarrayDivK(int[] arr, int k) {
        int n=arr.length;
        int max=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum%k==0){
                    max=Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
    //Optimal
    public static int longestSubarrayDivKOpti(int[] arr, int k) {
        int n=arr.length;
        Map<Integer,Integer>map=new HashMap<>();
        int sum=0,max=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            int rem=sum%k;
            if(rem<0){
                rem+=k;
            }
            if(rem==0){
                max=i+1;
            }
            if(map.containsKey(rem)){
                max=Math.max(max,i-map.get(rem));
            }
            else{
                map.put(rem,i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[]arr={2, 7, 6, 1, 4, 5};
        int k=3;
        System.out.println(longestSubarrayDivK(arr,k));
        System.out.println(longestSubarrayDivKOpti(arr,k));
    }
}