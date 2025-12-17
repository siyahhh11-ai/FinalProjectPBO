/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pboproject2;

/**
 *
 * @author Lenovo
 */
public class Celana extends Product {
    public Celana(String size) {
        super(size);
        nama = "Celana";
        harga = 50000;
    }

    //method
    public int getHarga() {
        return harga;
    }
}