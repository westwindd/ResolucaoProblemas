import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);

        System.out.println("B I N G O");
        for (int i = 0; i < 25; i++) {
            System.out.print(numbers.get(i) + " ");
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
    }
}
