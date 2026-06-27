/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance;

/**
 *
 * @author Corvoo
 */
public class SepedaMotor extends Darat {
    int kapasitasMesin;
    String deskripsi;

    SepedaMotor(String nama, String mesin, String jenis, String tempat, int kapasitasMesin) {
        super(nama, mesin, jenis, tempat);
        this.kapasitasMesin = kapasitasMesin;
    }

    SepedaMotor(String nama, String jenis, String tempat, int kapasitasMesin) {
        super(nama, jenis, tempat);
        this.kapasitasMesin = kapasitasMesin;
    }

    SepedaMotor(String nama, String jenis, String tempat, int kapasitasMesin, String deskripsi) {
        super(nama, jenis, tempat);
        this.kapasitasMesin = kapasitasMesin;
        this.deskripsi = deskripsi;
    }

    @Override
    void view() {
        super.view();
        System.out.println("Kapasitas Mesin : " + kapasitasMesin + "CC");
    }

    void viewDetail() {
        super.view();
        System.out.println("Kapasitas Mesin : " + kapasitasMesin + "CC");
        System.out.println("Deskripsi : " + deskripsi);
    }
}
