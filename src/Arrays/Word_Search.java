package Arrays;
import java.util.*;

public class Word_Search {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter The Number Of the Row: ");
        int row = inp.nextInt();
        System.out.print("Enter The Number Of the Col: ");
        int col = inp.nextInt();

        char [][] board = new char[row][col];
        System.out.print("Enter The Array Element: ");
        for(int i = 0; i <row; i++){
            for(int j=0;j<col; j++){
                board[i][j] = inp.next().charAt(0);
            }
        }
        //Output
        for(int i = 0; i <row; i++){
            for(int j=0;j<col; j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Enter Word");
        String word = inp.next();
        System.out.println(exists(board,word));

    }
    public static boolean exists(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                //calling the recursive method
                if (exists(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean exists(char[][] board, int i, int j, String word, int counter) {
        //Base Case 1
        if(counter == word.length()) return true;
        //Base Case 2
        if(i > board.length-1 || i <0 || j<0 || j >board[0].length-1 ||
                board[i][j]!=word.charAt(counter))
            return false;

        //visited array index repalced with '*'
        board[i][j]='*';

        boolean found =    exists(board, i-1, j, word, counter+1) ||
                exists(board, i, j-1, word, counter+1) ||
                exists(board, i, j+1, word, counter+1) ||
                exists(board, i+1, j, word, counter+1);
        board[i][j] = word.charAt(counter);
        return found;
    }

}
