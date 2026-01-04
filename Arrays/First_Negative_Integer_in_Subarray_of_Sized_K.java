import java.util.*;
class Main{
    //Brute Force
    public static List<Integer> firstNegInt(int arr[], int k) {
        List<Integer>ans=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<=n-k;i++){
            int neg_no=0;
            for(int j=i;j<i+k;j++){
                if(arr[j]<0){
                    neg_no=arr[j];
                    break;
                }
            }
            ans.add(neg_no);
        }
        return ans;
    }
    //Optimal
    public static List<Integer> firstNegIntOpti(int arr[], int k) {
        List<Integer>ans=new ArrayList<>();
        Queue<Integer>q=new LinkedList<>();
        int n=arr.length;

        int i=0,j=0;

        while(j<n){
            if(arr[j]<0){
                q.add(arr[j]);
            }
            if(j-i+1<k){
                j++;
            }
            else{
                if(q.isEmpty()){
                    ans.add(0);
                }
                else{
                    ans.add(q.peek());
                }

                if(!q.isEmpty() && arr[i]==q.peek()){
                    q.poll();
                }
                i++;
                j++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        System.out.println(firstNegInt(arr,k));
        System.out.println(firstNegIntOpti(arr,k));
    }
}