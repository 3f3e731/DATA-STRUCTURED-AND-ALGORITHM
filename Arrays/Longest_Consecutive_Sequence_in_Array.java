import java.util.*;
public class Main {
    //Brute Force
    public static int Longest(int[]arr){
        int n=arr.length;
        Arrays.sort(arr);
        int longest=1,count=1;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                continue;
            }
            else if(arr[i]==arr[i-1]+1){
                count++;
            }
            else{
                count=1;
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }
    //Optimal
    public static int LongestOpti(int[]arr){
        int n=arr.length;
        Set<Integer>set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int longest=0;
        for(int num:arr){
            if(!set.contains(num-1)){
                int current_sum=num;
                int count=1;

                while(set.contains(current_sum+1)){
                    current_sum++;
                    count++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int arr[]={0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(Longest(arr));
        System.out.println(LongestOpti(arr));
    }
}

