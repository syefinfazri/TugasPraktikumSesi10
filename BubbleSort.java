public class BubbleSort {
    public static void main(String[] args) {

        int[] data = {34, 12, 45, 2, 18};

        System.out.println("Data sebelum sorting:");
        cetak(data);

        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }

        System.out.println("Data setelah sorting ascending:");
        cetak(data);
    }

    static void cetak(int[] arr) {
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }
}
