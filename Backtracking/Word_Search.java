import java.util.*;

public class Main {
    public static boolean solve(char[][] board, String word, int row, int col, int index, boolean[][] visited){
        int n=board.length;
        int m=board[0].length;

        if(row<0||col<0||row>=n||col>=m||visited[row][col]||board[row][col]!=word.charAt(index)){
            return false;
        }
        if(index==word.length()-1){
            return true;
        }

        visited[row][col]=true;

        boolean found=solve(board,word,row+1,col,index+1,visited)||
                solve(board,word,row-1,col,index+1,visited)||
                solve(board,word,row,col+1,index+1,visited)||
                solve(board,word,row,col-1,index+1,visited);

        visited[row][col]=false;
        return found;
    }
    public static boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;

        boolean [][]visited=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    if(solve(board,word,i,j,0,visited)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        char [][]board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word="SEE";

        if(exist(board,word)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}