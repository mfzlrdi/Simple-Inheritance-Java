/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance;

/**
 *
 * @author Fani
 */
public class Darat extends Kendaraan {
    String tempat;
    
    Darat(String nama, String mesin, String jenis, String tempat){
        super(nama, mesin, jenis);
        this.tempat = tempat;
    }
    
    Darat(String nama, String jenis, String tempat){
        super(nama, jenis);
        this.tempat = tempat;
    }
    
    @Override
    void view(){
        System.out.print("===== Data Kendaraan Darat =====\n");
        super.view();
        System.out.println("Tempat : " + tempat);
    }
}
