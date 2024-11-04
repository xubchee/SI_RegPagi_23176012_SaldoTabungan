package latihan.pertemuan6;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class SI_RegPagi_23176012_SaldoTabungan {
public static void main(String[] args) {
        // Deklarasi variabel
        int saldoAwal, bungaPerBulan, lamaBulan;

        // Membaca input dari pengguna
        Scanner inputan = new Scanner(System.in);
        System.out.print("Saldo awal: Rp. ");
        saldoAwal = inputan.nextInt();
        System.out.print("Bunga per bulan (%): ");
        bungaPerBulan = inputan.nextInt();  
        System.out.print("Lama (bulan): ");
        lamaBulan = inputan.nextInt();
        
        NumberFormat formatter = new DecimalFormat("###,###");
        // Menghitung saldo tabungan
        for (int i = 1; i <= lamaBulan; i++) {
            saldoAwal = saldoAwal + (saldoAwal * bungaPerBulan / 100);
            String formatSaldo = formatter.format(saldoAwal).replace(",", ".");
            System.out.println("Saldo di bulan ke-" + i + " Rp. " +formatSaldo);
        }
    }
}
