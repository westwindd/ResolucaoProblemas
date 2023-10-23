public class ordena3 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        int c = (int) (Math.random() * 100);

        System.out.println("Valores gerados: " + a + ", " + b + ", " + c);

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Valores em ordem crescente: " + a + ", " + b + ", " + c);
    }
}
