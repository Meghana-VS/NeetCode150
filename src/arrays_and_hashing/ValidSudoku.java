package arrays_and_hashing;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'1','2','.','.','3','.','.','.','.'},
                {'4','.','.','5','.','.','.','.','.'},
                {'.','9','8','.','.','.','.','.','3'},
                {'5','.','.','.','6','.','.','.','4'},
                {'.','.','.','8','.','3','.','.','5'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','.','.','.','.','.','2','.','.'},
                {'.','.','.','4','1','9','.','.','8'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println(isValidSudoku(board));
    }
    public static boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char currentVal  = board[i][j];
                if(currentVal  != '.'){
                    String rowVal = currentVal + " found in row "+ i;
                    String columnVal = currentVal + " found in column "+ j;
                    String subBoxVal = currentVal + " found in sub box "+ i/3 +"-"+ j/3;

                    if(!seen.add(rowVal) || !seen.add(columnVal) || !seen.add(subBoxVal)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
