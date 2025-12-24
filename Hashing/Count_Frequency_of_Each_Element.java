import java.util.*;
class Main{
    public static void freq(int []arr){
        Map<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        Set<Integer>keys=map.keySet();
        for(Integer k:keys){
            System.out.println("key="+k+" Value="+map.get(k));
        }
        System.out.println();
    }
    public static void freqShortWay(int []arr){
        Map<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        Set<Integer>keys=map.keySet();
        for(Integer k:keys){
            System.out.println("key="+k+" Value="+map.get(k));
        }
    }
    public static void main(String[] args) {
        int arr[]={10,5,10,15,10,5};
        freq(arr);
        freqShortWay(arr);
    }
}