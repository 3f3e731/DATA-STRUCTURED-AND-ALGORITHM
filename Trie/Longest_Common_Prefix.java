import java.util.*;
public class Main {
    static class Node{
        Node[]children=new Node[26];
        boolean eow=false;
    }
    public static Node root=new Node();

    public static void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }
    public static String getLCP(){
        Node curr=root;
        StringBuilder sb=new StringBuilder();

        while(true){
            int count=0;
            int childIdx=-1;
            for(int i=0;i<26;i++){
                if(curr.children[i]!=null){
                    count++;
                    childIdx=i;
                }
            }

            if(count!=1 || curr.eow){
                break;
            }

            sb.append((char)(childIdx+'a'));
            curr=curr.children[childIdx];
        }
        return sb.toString();
    }
    public static String longestCommonPrefix(String[] strs) {
        root=new Node();
        for(String word:strs){
            insert(word);
        }

        return getLCP();
    }
    public static void main(String[]args){
        String[]arr={"flower","flow","flight"};
        System.out.print(longestCommonPrefix(arr));
    }
}
