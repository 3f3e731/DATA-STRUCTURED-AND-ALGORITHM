import java.util.*;
class Main{
    public static String minWindow(String s, String t){
        int n=s.length();
        if(t.length()>n){
            return "";
        }
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        int i=0,j=0;
        int required_Sum=t.length();
        int minWindowSize=Integer.MAX_VALUE;
        int start_i=0;

        while(j<n) {
            char ch = s.charAt(j);
            if (map.containsKey(ch)) {
                if (map.get(ch) > 0) {
                    required_Sum--;
                }
                map.put(ch, map.get(ch) - 1);
            }

            while (required_Sum == 0) {
                int currentWindowSize = j - i + 1;
                if (currentWindowSize < minWindowSize) {
                    minWindowSize = currentWindowSize;
                    start_i = i;
                }
                char leftChar = s.charAt(i);
                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);
                    if (map.get(leftChar) > 0) {
                        required_Sum++;
                    }
                }
                i++;
            }
            j++;
        }
        return minWindowSize==Integer.MAX_VALUE?"":s.substring(start_i,start_i+minWindowSize);
    }
    public static void main(String[] args) {
        String s="ADOBECODEBANC";
        String t="ABC";
        System.out.println(minWindow(s,t));
    }
}