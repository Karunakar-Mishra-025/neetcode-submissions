
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            boolean[] digits=new boolean[10];
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.') continue;
                if(digits[board[i][j]  - '0' ]) return false;
                digits[board[i][j]  - '0' ]=true;
            }
        }
        for(int i=0;i<board.length;i++){
            boolean[] digits=new boolean[10];
            for(int j=0;j<board[0].length;j++){
                if(board[j][i]=='.') continue;
                if(digits[board[j][i] - '0']) return false;
                digits[board[j][i] - '0' ]=true;
            }
        }
        for (int i = 0; i < board.length; i += 3) {
            for (int j = 0; j < board[0].length; j += 3) {
            boolean[] digits=new boolean[10];
                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        if(board[x][y]=='.') continue;
                        if(digits[board[x][y] - '0']) return false;
                        digits[board[x][y] - '0' ]=true;
                    }
                }

            }
        }
        return true;
    }
}