import java.util.*;
class Main {
    static class Node{
        Node []children=new Node[26];
        boolean eow=false;
        String word;

        public Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }

    public static Node root=new Node();

    public static void insert(String key){
        Node curr=root;
        for(int i=0;i<key.length();i++){
            int idx=key.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
        curr.word=key;
    }

    public static void dfs(char[][]board,int i,int j,Node root,List<String>result){
        int m = board.length;
        int n = board[0].length;

        if(i<0 || i>=m || j<0 || j>=n){
            return;
        }
        char ch=board[i][j];

        if(ch=='#' || root.children[ch-'a']==null){
            return;
        }
        root=root.children[ch-'a'];

        if(root.eow==true){
            result.add(root.word);
            root.eow=false;
        }

        char temp=board[i][j];
        board[i][j]='#';

        int[]dx={1, -1, 0, 0};
        int[]dy={0, 0, 1, -1};

        for(int k=0;k<4;k++){
            int new_i=i+dx[k];
            int new_j=j+dy[k];

            dfs(board,new_i,new_j,root,result);
        }
        board[i][j]=temp;
    }
    public static List<String> findWords(char[][] board, String[] words) {
        root=new Node();
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }

        int m=board.length; //row
        int n=board[0].length;  //col

        List<String>result=new ArrayList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int idx=board[i][j]-'a';

                if(root.children[idx]!=null){
                    dfs(board,i,j,root,result);
                }
            }
        }
        return result;
    }
    public static void main(String[]args){
        char[][] board = {
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}
        };
        String []words = {"oath","pea","eat","rain"};

        System.out.println(findWords(board,words));
    }
}