import java.util.*;
public class Main {
    public static boolean isAnagram(String str1,String str2){
        if(str1.length()==str2.length()){
            char []arr1=str1.toString().toCharArray();
            char []arr2=str2.toString().toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1,arr2)){
                return true;
            }
            else{
                return false;
            }
        }
        return false;

    }
    public static List<List<String>> groupAnagram(String[]strs){
        List<List<String>> result=new ArrayList<>();
        boolean[] visted=new boolean[strs.length];

        for(int i=0;i<strs.length;i++){
            if(visted[i]){
                continue;
            }
            List<String>group=new ArrayList<>();
            group.add(strs[i]);
            visted[i]=true;

            for(int j=i+1;j<strs.length;j++){
                if(!visted[j] && isAnagram(strs[i],strs[j])){
                    group.add(strs[j]);
                    visted[j]=true;
                }
            }
            result.add(group);
        }
        return result;
    }
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagram(strs));
    }
}