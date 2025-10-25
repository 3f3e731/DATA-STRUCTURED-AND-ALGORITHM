import java.util.*;
class Hashing{
    public static void main(String[] args) {
        int []nums={4,3,2,5,6,7,3,4,2,1};
        //Brute Force
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!ans.contains(nums[i])){
                ans.add(nums[i]);
            }
            else{
                continue;
            }
        }
        System.out.println("Distinct Element Count: "+ans.size());

        //Optimize(HashSet)-O(n)
        HashSet<Integer>set=new HashSet<>();

        for(int i:nums){
            set.add(i);
        }
        System.out.println("Distinct Element Count: "+set.size());
    }
}