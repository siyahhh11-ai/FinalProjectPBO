/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pboproject2;

/**
 *
 * @author Lenovo
 */

abstract class Produk {
    String nama;
    int harga;
    String size;

    // constructor
    public Produk(String size) {
        this.size = size;
    }

    // abstract method
    public abstract int getHarga();

    // method biasa
    public String getDetail() {
        return nama + " (Size " + size + ") - " + getHarga();
    }
    
}
