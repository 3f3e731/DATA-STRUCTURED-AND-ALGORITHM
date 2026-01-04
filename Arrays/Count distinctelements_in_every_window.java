import java.util.*;
class Main{
    //Brute Force
    public static ArrayList<Integer> countDistinct(int arr[], int k) {
        int n=arr.length;
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<=n-k;i++){
            Set<Integer>set=new HashSet<>();
            for(int j=i;j<i+k;j++){
                set.add(arr[j]);
            }
            ans.add(set.size());
        }
        return ans;
    }
    //Optimal
    public static ArrayList<Integer> countDistinctOpti(int arr[], int k) {
        int n=arr.length;
        ArrayList<Integer>ans=new ArrayList<>();
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<k;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ans.add(map.size());
        for(int j=k;j<n;j++){
            int out=arr[j-k];
            map.put(out,map.get(out)-1);

            if(map.get(out)==0){
                map.remove(out);
            }
            int in=arr[j];
            map.put(in,map.getOrDefault(in,0)+1);

            ans.add(map.size());
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        System.out.println(countDistinct(arr,k));
        System.out.println(countDistinctOpti(arr,k));
    }
}_