public class Maior3 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        int c = (int) (Math.random() * 100);

        System.out.println("Valores gerados: " + a + ", " + b + ", " + c);

        int maior = a;

        if (b > maior) {
            maior = b;
        }

        if (c > maior) {
            maior = c;
        }

        System.out.println("Maior valor: " + maior);
    }
}
