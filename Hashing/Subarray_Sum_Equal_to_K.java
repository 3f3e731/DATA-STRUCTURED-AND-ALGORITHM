import java.util.*;
class Hashing{
    public static void main(String[] args) {
        int []arr={1,2,3};
        int k=3;

        //Brute-Force -O(n2)
        int count=0;
        int sum1=0;
        for(int i=0;i<arr.length;i++){
            sum1+=arr[i];
            if(sum1==k){
                count++;
            }
            for(int j=i+1;j<arr.length;j++){
                sum1=sum1+arr[j];
                if(sum1==k){
                    count++;
                }
            }
            sum1=0;
        }
        System.out.println(count);

        //Optimize -O(n)
        HashMap<Integer,Integer>map=new HashMap<>();

        map.put(0,1);

        int ans=0;
        int sum=0;

        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        System.out.println(ans);
    }
}