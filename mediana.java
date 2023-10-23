public static int medianaDeTres(int[] arr, int low, int high) {
    int mid = low + (high - low) / 2;
    int a = arr[low];
    int b = arr[mid];
    int c = arr[high];
    
    if (a > b) {
        if (a < c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    } else {
        if (a > c) {
            return a;
        } else if (b < c) {
            return b;
        } else {
            return c;
        }
    }
}