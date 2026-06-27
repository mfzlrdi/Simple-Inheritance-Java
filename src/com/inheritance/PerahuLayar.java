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
public class PerahuLayar extends Laut {
    double kecepatanMesin;

    PerahuLayar(String nama, String mesin, String jenis, String tempat, double kecepatanMesin) {
        super(nama, mesin, jenis, tempat);
        this.kecepatanMesin = kecepatanMesin;
    }

    @Override
    void view() {
        super.view();
        System.out.println("Kecepatan Mesin : " + kecepatanMesin + "knot");
    }
}
