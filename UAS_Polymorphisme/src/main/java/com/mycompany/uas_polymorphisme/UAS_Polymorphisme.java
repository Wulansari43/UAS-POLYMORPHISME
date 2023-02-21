/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uas_polymorphisme;

/**
 *
 * @author ASUS
 */
public class UAS_Polymorphisme {

    public static void main(String[] args) {
        Kendaraan k;
        Kereta krt =new Kereta();
        Pesawat pst =new Pesawat();
        Motor mtr =new Motor();
        
        k = krt;
        k.bahanbakar();
        System.out.println();
        
        k = pst;
        k.bahanbakar();
        System.out.println();
        
        k = mtr;
        k.bahanbakar();
        System.out.println();
    
    }
}
