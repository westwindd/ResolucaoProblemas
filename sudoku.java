import java.util.Random;

public class SudokuValidator {
    
    public static void main(String[] args) {
        // Inicializando uma matriz 9x9 com números aleatórios entre 1 e 9
        int[][] sudoku = new int[9][9];
        Random rand = new Random();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = rand.nextInt(9) + 1;
            }
        }
        
        // Imprimindo a matriz gerada
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }

        // Verificando se a solução é válida
        if (isValidSudoku(sudoku)) {
            System.out.println("A solução do Sudoku é válida.");
        } else {
            System.out.println("A solução do Sudoku não é válida.");
        }
    }
    
    public static boolean isValidSudoku(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] < 1 || board[i][j] > 9 || !isValid(board, i, j, board[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(int[][] board, int row, int col, int num) {
        for (int x = 0; x < 9; x++) {
            if ((board[row][x] == num && x != col) || (board[x][col] == num && x != row)) {
                return false;
            }
        }

        int startRow = 3 * (row / 3);
        int startCol = 3 * (col / 3);
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num && (i != row || j != col)) {
                    return false;
                }
            }
        }
        return true;
    }
}
