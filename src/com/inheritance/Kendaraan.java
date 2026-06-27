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
public class Kendaraan {
    String nama;
    String mesin;
    String jenis;
    
    Kendaraan(String nama, String mesin, String jenis){
        this.nama = nama;
        this.mesin = mesin;
        this.jenis = jenis;
    }
    
    Kendaraan(String nama, String jenis){
        this.nama = nama;
        this.jenis = jenis;
    }
    
    void view(){
        System.out.println("Nama : " + nama);
        System.out.println("Mesin : " + mesin);
        System.out.println("Jenis : " + jenis);        
    }
}
