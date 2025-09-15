/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author rezon
 */
public class MainApp {

    public static void main(String[] args) {
         ArrayList<String> pemain = new ArrayList<>();
        ArrayList<String> asalTim = new ArrayList<>();
        ArrayList<String> klubTujuan = new ArrayList<>();
        ArrayList<Double> biayaTransfer = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MANAJEMEN LIST TRANSFER PEMAIN SEPAK BOLA ===");
            System.out.println("1. Tambah Data Transfer");
            System.out.println("2. Lihat Daftar Transfer");
            System.out.println("3. Ubah Data Transfer");
            System.out.println("4. Hapus Data Transfer");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // buang newline

            if (pilihan == 1) {
                System.out.print("Masukkan nama pemain: ");
                String nama = sc.nextLine();
                System.out.print("Masukkan asal tim: ");
                String asal = sc.nextLine();
                System.out.print("Masukkan klub tujuan: ");
                String klub = sc.nextLine();
                System.out.print("Masukkan biaya transfer (dalam juta euro): ");
                double biaya = sc.nextDouble();
                sc.nextLine();

                pemain.add(nama);
                asalTim.add(asal);
                klubTujuan.add(klub);
                biayaTransfer.add(biaya);

                System.out.println("Data transfer berhasil ditambahkan!");
            } 
            else if (pilihan == 2) {
                if (pemain.isEmpty()) {
                    System.out.println("Belum ada data transfer.");
                } else {
                    System.out.println("\n=== DAFTAR TRANSFER ===");
                    for (int i = 0; i < pemain.size(); i++) {
                        System.out.println((i+1) + ". " + pemain.get(i) 
                                           + " (" + asalTim.get(i) + ") -> " 
                                           + klubTujuan.get(i) 
                                           + " | Biaya: " + biayaTransfer.get(i) + " juta");
                    }
                }
            } 
            else if (pilihan == 3) {
                if (pemain.isEmpty()) {
                    System.out.println("Belum ada data untuk diubah.");
                } else {
                    System.out.print("Masukkan nomor data yang ingin diubah: ");
                    int idxUbah = sc.nextInt();
                    sc.nextLine();

                    if (idxUbah > 0 && idxUbah <= pemain.size()) {
                        System.out.print("Masukkan nama pemain baru: ");
                        String namaBaru = sc.nextLine();
                        System.out.print("Masukkan asal tim baru: ");
                        String asalBaru = sc.nextLine();
                        System.out.print("Masukkan klub tujuan baru: ");
                        String klubBaru = sc.nextLine();
                        System.out.print("Masukkan biaya transfer baru (dalam juta euro): ");
                        double biayaBaru = sc.nextDouble();
                        sc.nextLine();

                        pemain.set(idxUbah - 1, namaBaru);
                        asalTim.set(idxUbah - 1, asalBaru);
                        klubTujuan.set(idxUbah - 1, klubBaru);
                        biayaTransfer.set(idxUbah - 1, biayaBaru);

                        System.out.println("Data transfer berhasil diubah!");
                    } else {
                        System.out.println("Nomor tidak valid.");
                    }
                }
            } 
            else if (pilihan == 4) {
                if (pemain.isEmpty()) {
                    System.out.println("Belum ada data untuk dihapus.");
                } else {
                    System.out.print("Masukkan nomor data yang ingin dihapus: ");
                    int idxHapus = sc.nextInt();
                    sc.nextLine();

                    if (idxHapus > 0 && idxHapus <= pemain.size()) {
                        pemain.remove(idxHapus - 1);
                        asalTim.remove(idxHapus - 1);
                        klubTujuan.remove(idxHapus - 1);
                        biayaTransfer.remove(idxHapus - 1);
                        System.out.println("Data transfer berhasil dihapus!");
                    } else {
                        System.out.println("Nomor tidak valid.");
                    }
                }
            } 
            else if (pilihan == 5) {
                System.out.println("Keluar dari program...");
            } 
            else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);

        sc.close();
    }
}
