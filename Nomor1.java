import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input total penjualan
        double totalPenjualan = scanner.nextDouble();
        double komisi;

        // Menghitung komisi
        if (totalPenjualan <= 500000) {
            System.out.printf("%.1f%n", totalPenjualan);
        } else {
            double komisiPertama = 500000 * 0.10;
            double sisaPenjualan = totalPenjualan - 500000;
            double komisiSisa = sisaPenjualan * 0.15;
            komisi = komisiPertama + komisiSisa;
        }

        // Print hasil komisi
        System.out.printf("%.1f%n", komisi);
        scanner.close();
    }
}
