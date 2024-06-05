/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplikasi;


import java.util.Scanner;

abstract class KonverterSatuan {
    abstract double konversi(double nilai, String satuanDari, String satuanKe);
}



    
public class Aplikasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        KonverterSuhu konverterSuhu = new KonverterSuhu();
        KonverterPanjang konverterPanjang = new KonverterPanjang();
        KonverterBerat konverterBerat = new KonverterBerat();
        KonverterWaktu konverterWaktu = new KonverterWaktu();

        System.out.println("Selamat datang di Aplikasi Konversi Satuan!");

        OUTER:
        while (true) {
            System.out.println("\nPilih jenis konversi:");
            System.out.println("1. Konversi Suhu");
            System.out.println("2. Konversi Panjang");
            System.out.println("3. Konversi Berat");
            System.out.println("4. Konversi Waktu");
            System.out.println("0. Keluar");
            String choice = scanner.nextLine();
           
            
              
            switch (choice) {
                case "0":
                    System.out.println("Terima kasih telah menggunakan aplikasi konversi satuan. Sampai jumpa!");
                    break OUTER;
                case "1":
                    {
                        System.out.println("Masukkan nilai:");
                        double nilai = Double.parseDouble(scanner.nextLine());
                        System.out.println("Satuan asal (C/F/K):");
                        String satuanDari = scanner.nextLine().toUpperCase();
                        System.out.println("Satuan tujuan (C/F/K):");
                        String satuanKe = scanner.nextLine().toUpperCase();
                        double hasil = konverterSuhu.konversi(nilai, satuanDari, satuanKe);
                        System.out.println("Hasil konversi: " + hasil);
                        break;
                    }
                case "2":
                    {
                        System.out.println("Masukkan nilai:");
                        double nilai = Double.parseDouble(scanner.nextLine());
                        System.out.println("Satuan asal (m/cm/km):");
                        String satuanDari = scanner.nextLine().toLowerCase();
                        System.out.println("Satuan tujuan (m/cm/km):");
                        String satuanKe = scanner.nextLine().toLowerCase();
                        double hasil = konverterPanjang.konversi(nilai, satuanDari, satuanKe);
                        System.out.println("Hasil konversi: " + hasil);
                        break;
                    }
                case "3":
                    {
                        System.out.println("Masukkan nilai:");
                        double nilai = Double.parseDouble(scanner.nextLine());
                        break;
                    }
                default:
                    System.out.println("Inputan Salah");
                    break;
            }
        }
    }
}