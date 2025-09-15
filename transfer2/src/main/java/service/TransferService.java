/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.util.ArrayList;
import java.util.Scanner;
import model.Transfer;
/**
 *
 * @author rezon
 */
public class TransferService {
    private ArrayList<Transfer> daftarTransfer = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // CREATE
    public void tambahTransfer() {
        System.out.println("\n=== Tambah Transfer Pemain ===");
        System.out.print("Nama pemain : ");
        String nama = sc.nextLine();
        System.out.print("Asal tim : ");
        String asal = sc.nextLine();
        System.out.print("Tim baru tujuan : ");
        String tujuan = sc.nextLine();
        System.out.print("Biaya transfer pemain (Euro) : ");
        double biaya = sc.nextDouble(); sc.nextLine();

        Transfer t = new Transfer(nama, asal, tujuan, biaya);
        daftarTransfer.add(t);
        System.out.println("Data transfer berhasil ditambahkan!");
    }

    // READ
    public void lihatTransfer() {
        System.out.println("\n=== Daftar Transfer Pemain ===");
        if(daftarTransfer.isEmpty()){
            System.out.println("Belum ada data transfer...");
        } else {
            for (int i = 0; i < daftarTransfer.size(); i++) {
                Transfer t = daftarTransfer.get(i);
                System.out.println((i+1)+". "+t.getNamaPemain()+
                        " | "+t.getAsalTim()+" -> "+t.getKlubTujuan()+
                        " | Euro "+t.getBiayaTransfer());
            }
        }
    }

    // UPDATE
    public void ubahTransfer() {
        lihatTransfer();
        if(daftarTransfer.isEmpty()) return;

        System.out.print("Pilih nomor yang mau diubah: ");
        int idx = sc.nextInt(); sc.nextLine();

        if(idx < 1 || idx > daftarTransfer.size()){
            System.out.println("Nomor tidak valid!");
        } else {
            Transfer t = daftarTransfer.get(idx-1);
            System.out.print("Nama pemain baru ("+t.getNamaPemain()+"): ");
            String nama = sc.nextLine();
            System.out.print("Asal tim baru ("+t.getAsalTim()+"): ");
            String asal = sc.nextLine();
            System.out.print("Tujuan tim baru ("+t.getKlubTujuan()+"): ");
            String tujuan = sc.nextLine();
            System.out.print("Biaya transfer baru ("+t.getBiayaTransfer()+"): ");
            double biaya = sc.nextDouble(); sc.nextLine();

            t.setNamaPemain(nama);
            t.setAsalTim(asal);
            t.setKlubTujuan(tujuan);
            t.setBiayaTransfer(biaya);

            System.out.println("Data berhasil diubah!");
        }
    }

    // DELETE
    public void hapusTransfer() {
        lihatTransfer();
        if(daftarTransfer.isEmpty()) return;

        System.out.print("Pilih nomor yang mau dihapus: ");
        int idx = sc.nextInt(); sc.nextLine();

        if(idx < 1 || idx > daftarTransfer.size()){
            System.out.println("Nomor tidak valid!");
        } else {
            daftarTransfer.remove(idx-1);
            System.out.println("Data transfer berhasil dihapus!");
        }
    }

    // SEARCH (opsional, sederhana)
    public void cariTransfer() {
        System.out.print("Masukkan nama pemain yang dicari: ");
        String keyword = sc.nextLine();
        boolean ketemu = false;
        for (Transfer t : daftarTransfer){
            if(t.getNamaPemain().equalsIgnoreCase(keyword)){
                System.out.println("Ditemukan: "+t.getNamaPemain()+
                        " dari "+t.getAsalTim()+
                        " ke "+t.getKlubTujuan()+
                        " | Euro "+t.getBiayaTransfer());
                ketemu = true;
            }
        }
        if(!ketemu){
            System.out.println("Data tidak ditemukan...");
        }
    }
}
