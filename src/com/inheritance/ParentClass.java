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
public class ParentClass {
    String nama;
    String judul = "Parent Class";

    void tampil() {
        System.out.println("Nama Parent = " + this.nama);
    }

    ParentClass(String nama) {
        this.nama = nama;
    }
}
