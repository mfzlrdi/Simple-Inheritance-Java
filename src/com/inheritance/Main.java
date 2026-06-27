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
public class Main {
    public static void main(String args[]){
        // ========== OVERLOADING =============
        Penjumlahan angka = new Penjumlahan();
        System.out.println("A + B = " + angka.jumlah(2, 3));
        System.out.println("A + B = " + angka.jumlah(0.2, 0.3));
        System.out.println("Hasil : " + angka.jumlah(7, 8));
        System.out.println("Hasil : " + angka.jumlah(0.6, 0.4));
        
        int a=5, b=10;
        System.out.println(a + " + " + b + " = " + angka.jumlah(a, b));
        double c=0.5, d=0.2;
        System.out.println(c + " + " + d + " = " + angka.jumlah(c, d));
        System.out.println(angka.jumlah(c, d));
        
        angka.tampil(a, b);
        angka.tampil(c, d);
        // ========== OVERRIDING =============
        System.out.print("================================\n");
//        ParentClass data1 = new ParentClass();
//        data1.nama="Ani";
//        data1.tampil();
//        
//        ChildClass data2 = new ChildClass();
//        data2.nama="Adi";
//        data2.usia=2;
//        data2.tampilSuper();
//        data2.tampil();
//        
//        data2.tampilSub();
        
        System.out.print("================================\n");
//        ChildClass data3 = new ChildClass();
//        data3.nama="Ira";
//        data3.tampilNama();
          ParentClass nama1 = new ParentClass("Nia");
          nama1.tampil();
          ChildClass nama2 = new ChildClass("Yuli",2);
          nama2.tampilNama();
          
          nama2.tampilSub();
          nama2.tampilSuper();
        
        System.out.print("================================\n");
        Kendaraan trans1 = new Kendaraan("Mobil","Honda", "Roda Empat");
        Kendaraan trans2 = new Kendaraan("Mobil","Honda");
        trans1.view();
        trans2.view();
        
        Darat transportasi1 = new Darat("Vario", "Honda", "Sepeda Motor", " Darat");
        Laut transportasi2 = new Laut("Ferarry", "Sazuki", "Perahu Layar", "Laut");
        
        transportasi1.view();
        transportasi2.view();
        
        SepedaMotor transportasi3 = new SepedaMotor("Honda Beat", "Honda", "Sepeda Motor", "Darat", 250);
        PerahuLayar transportasi4 = new PerahuLayar("Kapal Patroli", "Overhaul", "Perahu Layar", "Laut", 0.81);
        transportasi3.view();
        transportasi4.view();
        
        SepedaMotor transportasi5 = new SepedaMotor("Scoopy", "Sepeda Motor", "Darat", 100,"good");
        transportasi5.viewDetail();
    }
}
