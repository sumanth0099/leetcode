class Solution {
    public int numRookCaptures(char[][] board) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        
        int captures = 0;
        for (int j = y + 1; j < 8; j++) {
            if (board[x][j] == 'p') {
                captures++;
                break;
            } else if (board[x][j] == 'B') {
                break;
            }
        }
        
        for (int j = y - 1; j >= 0; j--) {
            if (board[x][j] == 'p') {
                captures++;
                break;
            } else if (board[x][j] == 'B') {
                break;
            }
        }
        
        for (int i = x + 1; i < 8; i++) {
            if (board[i][y] == 'p') {
                captures++;
                break;
            } else if (board[i][y] == 'B') {
                break;
            }
        }
        
        for (int i = x - 1; i >= 0; i--) {
            if (board[i][y] == 'p') {
                captures++;
                break;
            } else if (board[i][y] == 'B') {
                break;
            }
        }
        
        return captures;
    }
}