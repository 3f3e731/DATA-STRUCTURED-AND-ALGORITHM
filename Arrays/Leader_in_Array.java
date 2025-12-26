import java.util.*;
class Main{
    //Brute Force
    public static ArrayList<Integer> leaderArray(int []arr){
        int n=arr.length;
        ArrayList<Integer>ans=new ArrayList<>();
        if(arr.length==0){
            return ans;
        }
        for(int i=0;i<n;i++){
            boolean flag=true;
            for(int j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    flag=false;
                }
            }
            if(flag){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
    // Optimal
    public static ArrayList<Integer>leaderArrayOpti(int []arr){
        int n=arr.length;
        ArrayList<Integer>ans=new ArrayList<>();
        if(arr.length==0){
            return ans;
        }
        ans.add(arr[n-1]);
        int max=arr[n-1];

        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                ans.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        int []arr={10,22,12,3,0,6};
        ArrayList<Integer>result=leaderArray(arr);
        System.out.println(result);

        ArrayList<Integer>res=leaderArrayOpti(arr);
        System.out.println(res);
    }
}