/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gadgetdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Interface untuk Kamera
interface Camera {
    void ambilFoto();
    void rekamVideo();
}

// Interface untuk Bluetooth
interface Bluetooth {
    void kirimFile();
    void terimaFile();
    void koneksiPerangkat();
}

// Interface untuk WiFi
interface WiFi {
    void cariJaringan();
    void hubungkanJaringan();
    void lupakanJaringan();
}

// Interface untuk GPS
interface GPS {
    void ambilKordinat();
}

// Abstract class Gadget
abstract class Gadget {
    String merk;
    String model;
    

    Gadget(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    abstract void showDetails();
    abstract void showInterfaceMethods();
}

public class GadgetDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Gadget> smartphones = new ArrayList<>();
        List<Gadget> tablets = new ArrayList<>();
        List<Gadget> laptops = new ArrayList<>();
        
        OUTER:
        while (true) {
            System.out.println("Pilih jenis gadget untuk diinput:");
            System.out.println("1. Smartphone");
            System.out.println("2. Tablet");
            System.out.println("3. Laptop");
            System.out.println("0. Selesai");
            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            

           
            switch (pilihan) {
                case 0:
                    break OUTER;
                case 1:
                {
                     System.out.print("Merk: ");
                     String merk = scanner.nextLine();
                     System.out.print("Model: ");
                     String model = scanner.nextLine();
            
                    smartphones.add(new Smartphone(merk, model));
                    break;
                }
                case 2:
                {
                    System.out.print("Merk: ");
                    String merk = scanner.nextLine();
                    System.out.print("Model: ");
                    String model = scanner.nextLine();
            
                    tablets.add(new Tablet(merk, model));
                    break;
                }
                case 3:
                {
                    System.out.print("Merk: ");
                    String merk = scanner.nextLine();
                    System.out.print("Model: ");
                    String model = scanner.nextLine();
            
                    laptops.add(new Laptop(merk, model));
                    break;
                }
               
                default:
                {
                    System.out.println("Silahkan masukkan nomor yang benar.");
                    break;
                }
            }
        }

        // Menampilkan semua data gadget yang telah diinputkan
        System.out.println("\nGadget Information:\n");

        if (!smartphones.isEmpty()) {
            System.out.println("Smartphones:");
            for (Gadget smartphone : smartphones) {
                smartphone.showDetails();
                smartphone.showInterfaceMethods();
                System.out.println();
            }
        }

        if (!tablets.isEmpty()) {
            System.out.println("Tablets:");
            for (Gadget tablet : tablets) {
                tablet.showDetails();
                tablet.showInterfaceMethods();
                System.out.println();
            }
        }

        if (!laptops.isEmpty()) {
            System.out.println("Laptops:");
            for (Gadget laptop : laptops) {
                laptop.showDetails();
                laptop.showInterfaceMethods();
                System.out.println();
            }
        }

        scanner.close();
    }
}