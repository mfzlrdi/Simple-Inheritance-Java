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
public class Penjumlahan {
    public int jumlah(int a, int b) {
        return a + b;
    }

    public double jumlah(double a, double b) {
        return a + b;
    }

    public void tampil(int a, int b) {
        System.out.println("Ini penjumlahan integer " + a + " + " + b);
    }

    public void tampil(double a, double b) {
        System.out.println("Ini penjumlahan double " + a + " + " + b);
    }
}
