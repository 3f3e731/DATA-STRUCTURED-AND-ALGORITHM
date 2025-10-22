import java.util.*;
class Hashing{
    public static boolean isAnagram1(String s, String t){
        int n=s.length(),x=t.length();

        //Approach-1
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();

        if(n!=x){
            return false;
        }
        else{
            for(int i=0;i<n;i++){
                map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
            }
            for(int i=0;i<x;i++){
                map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
            }
        }
        if(map1.equals(map2)){
            return true;
        }
        else{
            return false;
        }
    }

    //Approach-2
    public static boolean isAnagram2(String s, String t) {
        int n=s.length(),x=t.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch=s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(int i=0;i<x;i++){
            char ch=t.charAt(i);
            if(map.get(ch)!=null){
                if(map.get(ch)==1){
                    map.remove(ch);
                }
                else{
                    map.put(ch,map.get(ch)-1);
                }
            }
            else{
                return false;
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        String s="knee",t="keen";
        System.out.println(isAnagram1(s,t));
        System.out.println(isAnagram2(s,t));
    }
}