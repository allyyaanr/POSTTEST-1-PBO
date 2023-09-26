/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;
import java.util.ArrayList;
/**
 *
 * @author Lenovo
 */
public class Posttest1 {

    public static void main(String[] args) {
        ArrayList<roti> breads = new ArrayList();
        
        breads.add(new roti("Sausage Bread", 15000, 13));
        breads.add(new roti("Cheese Bread", 15000, 12));
        breads.add(new roti("Cinnamon Roll", 40000, 10));
        breads.add(new roti("Plain Bread", 15000, 7));
        breads.add(new roti("Donuts", 25000, 6));
    
        for (roti Roti : breads) {
            String pernyataan = "Roti " + Roti.getNama() + " dengan harga " + Roti.getHarga() + " masih ada stok sebanyak " + Roti.getStok();
            System.out.println(pernyataan);
        }
    }
}  