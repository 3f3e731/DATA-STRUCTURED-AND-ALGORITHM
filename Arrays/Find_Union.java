import java.util.*;
class Main{
    public static int[] mapApproach(int[]arr1, int []arr2){
        Map<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<arr1.length;i++){
            if(!map.containsKey(arr1[i])){
                map.put(arr1[i],1);
            }
        }
        for(int i=0;i<arr2.length;i++){
            if(!map.containsKey(arr2[i])){
                map.put(arr2[i],1);
            }
        }
        Set<Integer>keys=map.keySet();
        int[]ans=new int[map.size()];
        int idx=0;
        for(int k:keys){
            ans[idx++]=k;
        }
        return ans;
    }
    public static int[] setApproach(int[]arr1, int []arr2){
        Set<Integer>set=new HashSet<>();

        for(int x:arr1){
            set.add(x);
        }
        for(int x:arr2){
            set.add(x);
        }
        int []ans=new int[set.size()];
        int idx=0;
        for(int s:set){
            ans[idx++]=s;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7,8,9,10};
        int arr2[]={2,3,4,4,5,11,12};

        int[]result=mapApproach(arr1,arr2);
        System.out.println(Arrays.toString(result));

        int[]answer=setApproach(arr1,arr2);
        System.out.println(Arrays.toString(answer));
    }
}