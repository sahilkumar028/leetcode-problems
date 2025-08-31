class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char d='1';d<='9';d++){
                        if(isValid(board,i,j,d)){
                            board[i][j]=d;
                            if(solve(board)) return true;
                            board[i][j]='.';
                        }
                    }
                    return false;
                }

            }
        }
        return true;
    }
    public boolean isValid(char[][] board,int r,int c,char d){
        int board_r=(r/3*3);
        int board_c=(c/3*3);
        for(int i=0;i<9;i++){
            if(board[r][i]==d) return false;
            else if(board[i][c]==d) return false;
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[board_r+i][board_c+j]==d) return false;
            }
        }
        return true;
    }
}