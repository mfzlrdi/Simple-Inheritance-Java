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
public class Laut extends Kendaraan {
    String tempat;

    Laut(String nama, String mesin, String jenis, String tempat) {
        super(nama, mesin, jenis);
        this.tempat = tempat;
    }

    @Override
    void view() {
        System.out.print("===== Data Kendaraan Laut =====\n");
        super.view();
        System.out.println("Tempat : " + tempat);
    }
}
