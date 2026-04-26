package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue antrian = new Queue();
        Stack riwayat = new Stack();

        int pilihan;

        do {
            System.out.println("\n=== SISTEM KASIR TOKO ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Layani Pelanggan");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Lihat Riwayat Transaksi");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();
            System.out.print("\n");

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nomor Antrian: ");
                    String no = input.nextLine();

                    System.out.print("Masukkan Nama Pelanggan: ");
                    String nama = input.nextLine();

                    System.out.print("Masukkan Total Belanja: ");
                    double total = input.nextDouble();
                    input.nextLine();

                    antrian.tambahAntrian(no, nama, total);
                    System.out.println("Data pelanggan ditambahkan ke antrian!");
                    break;

                case 2:
                    Node dilayani = antrian.layaniPelanggan();

                    if (dilayani != null) {
                        System.out.println("Melayani pelanggan " + dilayani.nomorAntrian + " (" + dilayani.nama + ")");
                        riwayat.push(dilayani);
                        System.out.println("Transaksi disimpan ke riwayat.");
                    } else {
                        System.out.println("Antrian kosong!");
                    }
                    break;

                case 3:
                    System.out.println("=== Antrian Saat Ini ===");
                    antrian.tampilkan();
                    break;

                case 4:
                    System.out.println("=== Riwayat Transaksi (Terbaru) ===");
                    riwayat.tampilkan();
                    break;

                case 5:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);

        input.close();
    }
}