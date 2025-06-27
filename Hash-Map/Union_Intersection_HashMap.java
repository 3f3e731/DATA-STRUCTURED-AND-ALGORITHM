import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[]arr1={7,3,9};
        int[]arr2={6,3,9,2,9,4};
        HashSet<Integer> set=new HashSet<>();
        //union
        for(int arr:arr1){
            set.add(arr);
        }
        for(int arr:arr2){
            set.add(arr);
        }
        System.out.println("Union="+set.size());

        set.clear();
        //intersection
        for(int arr:arr1){
            set.add(arr);
        }
        int count=0;
        for(int arr:arr2){
            if(set.contains(arr)){
                count++;
                set.remove(arr);
            }
        }
        System.out.println("Intersection="+count);
    }
}