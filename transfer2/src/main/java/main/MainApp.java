package main;
import java.util.Scanner;
import service.TransferService;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TransferService service = new TransferService();
        int pilihan;

        do {
            System.out.println("\n=== MANAJEMEN LIST TRANSFER PEMAIN SEPAK BOLA ===");
            System.out.println("1. Tambah Data Transfer");
            System.out.println("2. Lihat Daftar Transfer");
            System.out.println("3. Ubah Data Transfer");
            System.out.println("4. Hapus Data Transfer");
            System.out.println("5. Cari Data Transfer");   // ✅ menu baru
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    service.tambahTransfer();
                    break;
                case 2:
                    service.lihatTransfer();
                    break;
                case 3:
                    service.ubahTransfer();
                    break;
                case 4:
                    service.hapusTransfer();
                    break;
                case 5:
                    service.cariTransfer();   // ✅ panggil method dari TransferService
                    break;
                case 6:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 6);

        sc.close();
    }
}
