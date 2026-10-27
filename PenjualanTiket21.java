import java.util.Scanner;

public class PenjualanTiket21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tiket, totalTiket = 0;
        int hargaTiket = 50000;
        double totalPenjualan = 0, subtotal, diskon, totalBayar;

        do {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            tiket = sc.nextInt();

            if (tiket == 0) {
                break;
            }

            if (tiket < 0) {
                System.out.println("Jumlah tiket tidak valid!");
                continue;
            }

            subtotal = tiket * hargaTiket;

            if (tiket > 10) {
                diskon = 0.15;
            } else if (tiket > 4) {
                diskon = 0.10;
            } else {
                diskon = 0;
            }

            totalBayar = subtotal - (subtotal * diskon);
            totalTiket += tiket;
            totalPenjualan += totalBayar;

            System.out.println("Jumlah tiket: " + tiket);
            System.out.println("Total pembayaran: Rp" + totalBayar);

        } while (true);

        System.out.println("\nTotal tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp" + totalPenjualan);

        sc.close();
    }
}