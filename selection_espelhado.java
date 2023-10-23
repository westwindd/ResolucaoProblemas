import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {7, 3, 10, 5, 8, 2, 9, 6, 1, 4};
        selectionSortEspelhado(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSortEspelhado(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            // Encontrar o mínimo e o máximo no subarray não ordenado
            int minIdx = i, maxIdx = i;
            for (int j = i + 1; j < n - i; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }

            // Trocar o mínimo e o máximo com os elementos corretos
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

            // Se o máximo estava na posição i, ele foi movido para minIdx, então atualizamos maxIdx
            if (maxIdx == i) {
                maxIdx = minIdx;
            }

            temp = arr[n - i - 1];
            arr[n - i - 1] = arr[maxIdx];
            arr[maxIdx] = temp;
        }
    }
}
