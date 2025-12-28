import java.util.*;
class Main{
    public static int[] repeatingAndMissing(int[]arr){
        Arrays.sort(arr);
        Map<Integer,Integer>map=new HashMap<>();
        int []result=new int[2];
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int k:map.keySet()){
            int freq=map.get(k);
            if(freq>1){
                result[0]=k;
            }
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1] && arr[i]!=arr[i-1]+1){
                result[1]=arr[i-1]+1;
                return result;
            }
        }

        result[1]=arr[arr.length-1]+1;
        return result;
    }
    public static int[] repeatingAndMissingOpti(int []arr){
        int n=arr.length;
        int ans[]=new int[2];
        int a=0,b,expectedSum=0,actualSum=0;
        Set<Integer>set=new HashSet<>();

        for(int i=0;i<n;i++){
            actualSum+=arr[i];
            if(set.contains(arr[i])){
                a=arr[i];
                ans[0]=a;
            }
            set.add(arr[i]);
        }

        expectedSum=(int)(n*(n+1))/2;
        b=expectedSum+a-actualSum;
        ans[1]=b;
        return ans;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,6,7,5,7};
        System.out.println(Arrays.toString(repeatingAndMissing(arr)));

        System.out.println(Arrays.toString(repeatingAndMissingOpti(arr)));
    }
}