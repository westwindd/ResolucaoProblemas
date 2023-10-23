public static int buscaMaisProx(int[] arr, int x) {
    if (x < arr[0] || x > arr[arr.length - 1]) {
        return -1; // Número fora do intervalo da sequência
    }

    int startIdx = (x - arr[0] < arr[arr.length - 1] - x) ? 0 : arr.length - 1;
    int step = (startIdx == 0) ? 1 : -1;

    for (int i = startIdx; i >= 0 && i < arr.length; i += step) {
        if (arr[i] > x) {
            break;
        }
        if (arr[i] == x) {
            return i; // Número encontrado
        }
    }
    return -1; // Número não encontrado
}
