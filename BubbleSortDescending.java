import java.util.Scanner;

public class BubbleSortDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int n = sc.nextInt();

        int[] data = new int[n];
        System.out.println("Masukkan elemen:");
        for (int i = 0; i < n; i++) data[i] = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (data[j] < data[j + 1]) { 
                    int t = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = t;
                }
            }
        }

        System.out.println("Hasil descending:");
        for (int x : data) System.out.print(x + " ");
    }
}
