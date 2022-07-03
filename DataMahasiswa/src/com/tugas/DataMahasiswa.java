package com.tugas;
//Muh. Ichsan
//22116023

import java.util.ArrayList;
import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {

        ArrayList<String> nama = new ArrayList<>();
        ArrayList<String> NIM = new ArrayList<>();
        ArrayList<String> alamat = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int pilih;

        do{
            System.out.println("\nProgram Data Mahasiswa");
            System.out.println("========================");
            System.out.println("1. Tambahkan Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Exit");
            System.out.print("\nPilih Menu: ");
            pilih = input.nextInt();

            if (pilih == 1){
                System.out.print("Masukan Nama: ");
                String nm = input.next();
                nama.add(nm);

                System.out.print("Masukan NIM: ");
                String nim = input.next();
                NIM.add(nim);

                System.out.print("Masukan Alamat: ");
                String alm = input.next();
                alamat.add(alm);
            } else if (pilih == 2) {
                System.out.println("Data Mahasiswa");
                System.out.println("==============");

                for (int i = 0; i < nama.size(); i++){
                    System.out.println(i + 1 + "." + nama.get(i));
                }
                System.out.println("Untuk Melihat Data Lengkap input 3");
            } else if (pilih == 3) {
                System.out.print("Masukan Data Nomor Yang Ingin Di Cari: ");
                int cari = input.nextInt();
                if (cari == 1){
                    System.out.println("Nama: " + nama.get(0));
                    System.out.println("NIM: " + NIM.get(0));
                    System.out.println("Alamat: " + alamat.get(0));
                }
                System.out.println("====================");

                if (cari == 2){
                    System.out.println("Nama: " + nama.get(1));
                    System.out.println("NIM: " + NIM.get(1));
                    System.out.println("Alamat: " + alamat.get(1));
                }
            } else if (pilih == 4) {
                System.out.println("Data Mahasiswa");
                System.out.println("==============");

                for (int i = 0; i < nama.size(); i++){
                    System.out.println(i + 1 + "." + nama.get(i));
                }
                System.out.print("Nama Yang Ingin Di Hapus: ");
                String nm = input.next();
                nama.remove(nm);
            } else if (pilih == 5) {
                System.out.println("Selesai");
            }else {
                System.err.println("Menu tidak Tersedia/Tidak ada");
            }
        }while(pilih !=5);
    }
    }