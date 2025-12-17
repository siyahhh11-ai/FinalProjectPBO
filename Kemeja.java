/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pboproject2;

import pboproject2.Produk;

/**
 *
 * @author Lenovo
 */
class Kemeja extends Produk {
    //konstruktor
   public Kemeja(String size) {
        super(size);
        this.nama = "Kemeja"; 
        this.harga = 50000;   
    }

    //method
    @Override
    public int getHarga() {
        return harga;
    }
}