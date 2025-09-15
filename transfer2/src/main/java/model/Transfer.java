/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author rezon
 */
public class Transfer {
    private String namaPemain;
    private String asalTim;
    private String klubTujuan;
    private double biayaTransfer;

    // Constructor
    public Transfer(String namaPemain, String asalTim, String klubTujuan, double biayaTransfer) {
        this.namaPemain = namaPemain;
        this.asalTim = asalTim;
        this.klubTujuan = klubTujuan;
        this.biayaTransfer = biayaTransfer;
    }

    // Getter dan Setter
    public String getNamaPemain() {
        return namaPemain;
    }

    public void setNamaPemain(String namaPemain) {
        this.namaPemain = namaPemain;
    }

    public String getAsalTim() {
        return asalTim;
    }

    public void setAsalTim(String asalTim) {
        this.asalTim = asalTim;
    }

    public String getKlubTujuan() {
        return klubTujuan;
    }

    public void setKlubTujuan(String klubTujuan) {
        this.klubTujuan = klubTujuan;
    }

    public double getBiayaTransfer() {
        return biayaTransfer;
    }

    public void setBiayaTransfer(double biayaTransfer) {
        this.biayaTransfer = biayaTransfer;
    }

    @Override
    public String toString() {
        return namaPemain + " (" + asalTim + ") -> " + klubTujuan + " | Biaya: €" + biayaTransfer + " juta";
    }
}
