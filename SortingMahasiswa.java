import java.util.Arrays;

class Mahasiswa {
    String nim, nama;
    double nilai;

    Mahasiswa(String nim, String nama, double nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
    }

    public String toString() {
        return nim + " | " + nama + " | " + nilai;
    }
}

public class SortingMahasiswa {
    public static void main(String[] args) {

        Mahasiswa[] data = {
            new Mahasiswa("001", "Bima", 85),
            new Mahasiswa("002", "Yngwie", 92),
            new Mahasiswa("003", "Sabian", 77),
            new Mahasiswa("004", "Rachel", 90),
            new Mahasiswa("005", "Quenby", 88)
        };

        System.out.println("=== Sort Nilai (Descending) ===");
        Arrays.sort(data, (a, b) -> Double.compare(b.nilai, a.nilai));

        for (Mahasiswa m : data) {
            System.out.println(m);
        }

        System.out.println("\n=== Sort Nama (Ascending A-Z) ===");
        Arrays.sort(data, (a, b) -> a.nama.compareToIgnoreCase(b.nama));

        for (Mahasiswa m : data) {
            System.out.println(m);
        }
    }
}
