public class Main {
    public static void main(String[] args) {
        int[] arr = {6, 2, 9, 4, 7, 1, 8, 5, 0};
        gnomeSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void gnomeSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (i == 0 || arr[i - 1] <= arr[i]) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                i--;
            }
        }
    }
}
