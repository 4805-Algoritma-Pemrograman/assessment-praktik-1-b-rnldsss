import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPendapatan = 0;
        int jumlahTransaksi = 0;
        boolean inputLagi = true;

        while (inputLagi) {
            int kodeBungalow = scanner.nextInt();
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

            char input = scanner.next().charAt(0);
            inputLagi = (input == 'Y' || input == 'y');
        }

        System.out.println(jumlahTransaksi);
        System.out.printf("%.1f%n", totalPendapatan);

        scanner.close();
    }
}
