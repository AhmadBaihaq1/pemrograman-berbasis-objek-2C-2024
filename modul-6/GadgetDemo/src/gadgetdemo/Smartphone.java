/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gadgetdemo;

class Smartphone extends Gadget implements Camera, Bluetooth, WiFi, GPS {
    Smartphone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void ambilFoto() {
        System.out.println(model + " is taking a photo...");
    }

    @Override
    public void rekamVideo() {
        System.out.println(model + " is recording a video...");
    }

    @Override
    public void kirimFile() {
        System.out.println(model + " is sending a file via Bluetooth...");
    }

    @Override
    public void terimaFile() {
        System.out.println(model + " is receiving a file via Bluetooth...");
    }

    @Override
    public void koneksiPerangkat() {
        System.out.println(model + " is connecting to a device via Bluetooth...");
    }

    @Override
    public void cariJaringan() {
        System.out.println(model + " is searching for WiFi networks...");
    }

    @Override
    public void hubungkanJaringan() {
        System.out.println(model + " is connecting to a WiFi network...");
    }

    @Override
    public void lupakanJaringan() {
        System.out.println(model + " is forgetting a WiFi network...");
    }

    @Override
    public void ambilKordinat() {
        System.out.println(model + " bisa mengambil koordinat GPS....");
    }

    @Override
    void showDetails() {
        System.out.println("Smartphone Details:");
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
    }
    
    @Override
    void showInterfaceMethods() {
        System.out.println("Implemented Interfaces Methods:");
        System.out.println("Camera:");
        ambilFoto();
        rekamVideo();
        System.out.println("Bluetooth:");
        kirimFile();
        terimaFile();
        koneksiPerangkat();
        System.out.println("WiFi:");
        cariJaringan();
        hubungkanJaringan();
        lupakanJaringan();
        System.out.println("GPS:");
        ambilKordinat();
    }
}
