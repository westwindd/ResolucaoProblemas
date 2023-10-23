import java.util.Arrays;
import java.util.Scanner;

public class MegaSena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] userNumbers = new int[6];
        int[] drawnNumbers = new int[6];
        int matchCount = 0;

        System.out.println("Digite as 6 dezenas do seu cartão (em ordem crescente):");
        for (int i = 0; i < 6; i++) {
            userNumbers[i] = scanner.nextInt();
        }

        System.out.println("Digite as 6 dezenas sorteadas (em ordem de sorteio):");
        for (int i = 0; i < 6; i++) {
            drawnNumbers[i] = scanner.nextInt();
        }

        for (int num : userNumbers) {
            if (Arrays.stream(drawnNumbers).anyMatch(x -> x == num)) {
                matchCount++;
            }
        }

        switch (matchCount) {
            case 4:
                System.out.println("Você fez uma quadra!");
                break;
            case 5:
                System.out.println("Você fez uma quina!");
                break;
            case 6:
                System.out.println("Parabéns, você fez uma sena!");
                break;
            default:
                System.out.println("Não foi dessa vez. Tente novamente.");
                break;
        }
    }
}
