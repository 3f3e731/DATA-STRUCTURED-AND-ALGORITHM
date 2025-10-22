import java.util.*;
class Hashing{
    public static void main(String[] args) {
        int []arr={1,3,2,5,1,3,1,5,1};
        int n=arr.length;

        // First-Method
        HashMap<Integer,Integer>map=new HashMap<>();

        System.out.println("first-Method");

        for(int i=0;i<n;i++){
            int num=arr[i];
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }

            if(map.get(arr[i])>(n/3)){
                System.out.println(arr[i]);
            }
        }

        //Second-Method
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        }
        System.out.println("Second-Method");
        Set<Integer>keys=hm.keySet();
        for(Integer k:keys){
            if(map.get(k)>(n/3)){
                System.out.println(k);
            }
        }
    }
}