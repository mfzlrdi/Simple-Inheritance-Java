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

class User {
    static int idUser;
    static String nama;
    static String noHp;

    static void addIdUser(int idUser) {
        User.idUser = idUser;
    }

    static void addNama(String nama) {
        User.nama = nama;
    }

    static void addNoHp(String noHp) {
        User.noHp = noHp;
    }

    static void display() {
        System.out.print("===== DATA USER =====\n");
        System.out.println("Id User = " + User.idUser);
        System.out.println("Nama User = " + User.nama);
        System.out.println("No HP User = " + User.noHp);
    }

    public static int getIdUser() {
        return idUser;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        User.nama = nama;
    }

    public static String getNoHp() {
        return noHp;
    }

    public static void setNoHp(String noHp) {
        User.noHp = noHp;
    }
}

class Siswa extends User {
    final static String jenisSiswa = "SISWA";
    static int point = 10;
    static int pointTambah = 10;

    static void displayJenisSiswa() {
        System.out.println("Jenis User = " + Siswa.jenisSiswa);
    }

    static void displayTambahPoint() {
        System.out.println("Point Awal Siswa = " + Siswa.point);
        tambahPoint();
        System.out.println("Point Baru Siswa = " + Siswa.point);
        System.out.print("==========\n");
    }

    public static int getPoint() {
        return point;
    }

    public static void setPoint(int pointBaru) {
        Siswa.point = pointBaru + point;
    }

    private static void tambahPoint() {
        Siswa.point = point + pointTambah;
    }
}

class Guru extends User {
    final static String jenisGuru = "GURU";
    static int point = 20;
    static int pointTambah = 20;

    static void displayJenisGuru() {
        System.out.println("Jenis User = " + Guru.jenisGuru);
    }

    static void displayTambahPoint() {
        System.out.println("Point Awal Guru = " + Guru.point);
        tambahPoint();
        System.out.println("Point Baru Guru = " + Guru.point);
        System.out.print("==========\n");
    }

    private static void tambahPoint() {
        Guru.point = point + pointTambah;
    }

    public static int getPoint() {
        return point;
    }

    public static void setPoint(int pointBaru) {
        Guru.point = pointBaru + point;
    }
}

class Tamu extends User {
    final static String jenisTamu = "TAMU";

    static void displayJenisTamu() {
        System.out.println("Jenis User = " + Tamu.jenisTamu);
    }

}

public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // ==================== DATA USER ====================
        User.addIdUser(1);
        User.addNama("Fani");
        User.addNoHp("087809883528");
        // User.display(); //DISPLAY DATA LAMA
        User.setNama("Sifa");
        User.display(); // DISPLAY DATA BARU
        System.out.print("\n");

        // ==================== DATA SISWA ====================
        Siswa.addIdUser(2);
        Siswa.addNama("Indri");
        Siswa.addNoHp("087809883529");
        // User.display(); //DISPLAY DATA LAMA
        Siswa.setNoHp("012355556666");
        Siswa.display(); // DISPLAY DATA BARU
        Siswa.displayJenisSiswa();
        Siswa.displayTambahPoint();
        Siswa.displayTambahPoint();
        Siswa.displayTambahPoint();
        Siswa.setPoint(40);
        Siswa.displayTambahPoint();
        System.out.print("\n");

        // ==================== DATA GURU ====================
        Guru.addIdUser(3);
        Guru.addNama("Hani, S.Kom");
        Guru.addNoHp("083800001111");
        Guru.display();
        Guru.displayJenisGuru();
        Guru.displayTambahPoint();
        Guru.displayTambahPoint();
        Guru.setPoint(30);
        Guru.displayTambahPoint();
        System.out.print("\n");

        // ==================== DATA TAMU ====================
        Tamu.addIdUser(4);
        Tamu.addNama("Sella");
        Tamu.addNoHp("088899996666");
        Tamu.display();
        Tamu.displayJenisTamu();

    }

}
