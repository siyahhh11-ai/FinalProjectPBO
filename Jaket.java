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
class Jaket extends Produk {
    public Jaket(String size) {
        super(size);
        nama = "Jaket";
        harga = 100000;
    }
    
      //method
    public int getHarga() {
        return harga;
    }
}