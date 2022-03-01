/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tugas1;

import java.util.Scanner;

/**
 *
 * @author NITRO 5
 */
public class main {
    public static void main(String[] args) {
        System.out.println("+-------------------------+");
        System.out.println("|PROGRAM KONVERSI SUHU AIR|");
        System.out.println("+-------------------------+");
        System.out.println("Input Data\n----------");
        System.out.print("Suhu Dalam Celcius\t: ");
        Scanner input = new Scanner(System.in);
        double suhu = input.nextDouble();//input suhu celcius
        konversisuhu konversi = new konversisuhu(suhu);
        
        OUTER:
        while (true) {
            System.out.println("\nOpsi\n----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("\nSuhu dalam Celcius\t: "+konversi.celcius+"\u00B0C");//menampilkan data
                    System.out.println("Dalam Fahrenheit\t: "+konversi.convertFahrenheit()+"\u00B0F");
                    System.out.println("Dalam Reamur\t\t: "+konversi.convertReamur()+"\u00B0R");
                    System.out.println("Dalam Kelvin\t\t: "+konversi.convertKelvin()+"K");
                    System.out.println(konversi.kondisiAir());
                    break;
                case 2:
                    System.out.println("\nInput Data\n----------");
                    System.out.print("Suhu Dalam Celcius\t: ");//input suhu celcius
                    suhu = input.nextDouble();
                    konversi.inputCelcius(suhu);
                    break;
                case 3:
                    System.exit(0);
                    break OUTER;
                default:
                    System.out.println("\nOpsi tidak ada. Mohon masukkan opsi dengan benar!");
                    break;
            }
        }
    }
}
