public class SelectionRecursivo {
    public static void selectionSort(int[] arr, int start) {
        if (start >= arr.length - 1) return;

        int minIndex = start;
        for (int j = start + 1; j < arr.length; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        if (minIndex != start) {
            int temp = arr[start];
            arr[start] = arr[minIndex];
            arr[minIndex] = temp;
        }
        selectionSort(arr, start + 1);
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        selectionSort(arr, 0);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
