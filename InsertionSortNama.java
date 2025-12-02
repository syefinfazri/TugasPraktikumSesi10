import java.util.Scanner;

public class InsertionSortNama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nama = new String[5];
        System.out.println("Masukkan 5 nama mahasiswa:");
        for (int i = 0; i < 5; i++) {
            nama[i] = sc.nextLine();
        }

        for (int i = 1; i < nama.length; i++) {
            String key = nama[i];
            int j = i - 1;

            while (j >= 0 && nama[j].compareToIgnoreCase(key) > 0) {
                nama[j + 1] = nama[j];
                j--;
            }
            nama[j + 1] = key;
        }

        System.out.println("Nama setelah diurutkan:");
        for (String n : nama) System.out.println(n);
    }
}
