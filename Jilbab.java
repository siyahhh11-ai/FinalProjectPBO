/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pboproject2;

/**
 *
 * @author Lenovo
 */

class Jilbab extends Produk {
    public Jilbab(String size) {
        super(size);
        nama = "Jilbab";
        harga = 60000;
    }

    //method
    public int getHarga() {
        return harga;
    }
}

