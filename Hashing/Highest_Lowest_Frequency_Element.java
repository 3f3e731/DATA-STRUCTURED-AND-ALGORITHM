import java.util.*;
class Main{
    public static void freqHighLow(int []arr){
        Map<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        int max=0;
        int min=Integer.MAX_VALUE;

        int maxElement=0;
        int minElement=0;

        Set<Integer>keys=map.keySet();
        for(Integer k:keys){
            int freq=map.get(k);

            if(freq>max){
                max=freq;
                maxElement=k;
            }
            if(freq<min){
                min=freq;
                minElement=k;
            }
        }

        System.out.println(maxElement+" "+minElement);
    }
    public static void main(String[] args) {
        int arr[]={10,5,10,15,10,5};
        freqHighLow(arr);
    }
}