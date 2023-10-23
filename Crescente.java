public class Crescente {
    public static boolean isCrescente(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  // Pode alterar para testar
        System.out.println(isCrescente(arr) ? "Os dados estão em ordem crescente." : "Os dados não estão em ordem crescente.");
    }
}
