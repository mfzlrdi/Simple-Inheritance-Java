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
public class ChildClass extends ParentClass{
    int usia;
    String judul="Child Class";
    @Override
           
    void tampil(){
         System.out.println("Nama Child = " + this.nama);
         System.out.println("Usia Child = " + this.usia + "tahun");
     }
    void tampilSub(){
        System.out.println("Data = " + this.judul);
    }
    void tampilSuper(){
        System.out.println("Data = " + super.judul);
    }
    
    void tampilNama(){
        System.out.println("Nama : " + super.nama);
        System.out.println("Nama : " + this.usia);
    }
    
    ChildClass(String nama, int usia){
        super(nama);
        this.usia = usia;
    }
}
