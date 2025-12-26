import java.util.*;
class Main{
    public static ArrayList<Integer> sortAccordingToOther(int[]arr1,int[]arr2){
        Map<Integer,Integer>map=new HashMap<>();
        for(int n:arr1){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        ArrayList<Integer>result=new ArrayList<>();
        for(int n:arr2){
            if(map.containsKey(n)){
                int freq=map.get(n);

                while(freq-->0){
                    result.add(n);
                }
                map.remove(n);
            }
        }

        List<Integer>remaining=new ArrayList<>();
        for(int key:map.keySet()){
            int freq=map.get(key);

            while(freq-->0){
                remaining.add(key);
            }
        }
        Collections.sort(remaining);
        result.addAll(remaining);

        return result;
    }
    public static void main(String[] args) {
        int []arr1={2,1,2,5,7,1,9,3,6,8,8};
        int []arr2={2,1,8,3};
        System.out.println(sortAccordingToOther(arr1,arr2));
    }
}