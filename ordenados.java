import java.util.Random;

public class Main {
    public static final int TAM = 10;

    public static void main(String[] args) {
        Random rand = new Random();
        int[][] matrix = new int[TAM][TAM];

        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                matrix[i][j] = i * TAM + j;
            }
        }

        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
