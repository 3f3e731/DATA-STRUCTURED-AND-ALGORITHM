class Main {
    //High Time-Complexity(O(2^(n+m))
    public static int gridWays(int i, int j, int n, int m){
        if(i==n-1 || j==m-1){
            return 1;
        }
        else if(i==n || j==m){
            return 0;
        }
        int w1=gridWays(i+1,j,n,m);
        int w2=gridWays(i,j+1,n,m);
        return w1+w2;
    }

    //Optimize
    public static int gridWays(int i, int j, int n, int m,int[][]dp){
        if(i==n-1 || j==m-1){
            return 1;
        }
        else if(i==n || j==m){
            return 0;
        }
        else if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int w1=gridWays(i+1,j,n,m,dp);
        int w2=gridWays(i,j+1,n,m,dp);
        return dp[i][j]=w1+w2;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(gridWays(0,0,n,m));

        int[][]dp=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(gridWays(0,0,n,m,dp));
    }
}