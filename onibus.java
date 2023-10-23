import java.util.Scanner;

public class Onibus {
    public static void main(String[] args) {
        String[] poltronas = new String[42];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 42; i++) {
            System.out.println("Passageiro " + (i + 1) + ", por favor, informe seu nome:");
            String nome = scanner.nextLine();

            System.out.println("Agora, por favor, informe o número da sua poltrona (1-42):");
            int numeroPoltrona = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            poltronas[numeroPoltrona - 1] = nome;
        }

        System.out.println("Lista de passageiros ordenada pelo número da poltrona:");
        for (int i = 0; i < 42; i++) {
            System.out.println("Poltrona " + (i + 1) + ": " + poltronas[i]);
        }

        scanner.close();
    }
}
