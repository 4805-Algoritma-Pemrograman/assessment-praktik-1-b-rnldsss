import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPendapatan = 0;
        int jumlahTransaksi = 0;
        boolean inputLagi = true;

        while (inputLagi) {
            System.out.print("Masukan kode bungalow [1/2/3]: ");
            int kodeBungalow = scanner.nextInt();
            System.out.print("lama menginap (malam): ");
            int lamaMenginap = scanner.nextInt();

            double tarif = 0;
            double biayaPelayananPersentase = 0;

            switch (kodeBungalow) {
                case 1:
                    tarif = 50000;
                    biayaPelayananPersentase = 0.30;
                    break;
                case 2:
                    tarif = 40000;
                    biayaPelayananPersentase = 0.20;
                    break;
                case 3:
                    tarif = 30000;
                    biayaPelayananPersentase = 0.10;
                    break;
                default:
                    System.out.println("Kode bungalow tidak valid.");
                    continue;
            }

            double biayaMenginap = lamaMenginap * tarif;
            double biayaPelayanan = biayaMenginap * biayaPelayananPersentase;
            double totalBiaya = biayaMenginap + biayaPelayanan;

            totalPendapatan += totalBiaya;
            jumlahTransaksi++;

            System.out.print("Input lagi (Y/N)?: ");
            char input = scanner.next().charAt(0);
            inputLagi = (input == 'Y' || input == 'y');
        }

        // Print jumlah transaksi sama total pendapatan.
        System.out.println("Jumlah transaksi penyewaan bungalow = "  + jumlahTransaksi);
        System.out.println("Total pendapatan = "  + totalPendapatan);
        scanner.close();
    }
}
