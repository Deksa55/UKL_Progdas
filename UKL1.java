/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl1;

/**
 *
 * @author Hp
 */
public class UKL1 {
   public static void main(String[] args) {

        for (int p = 50; p >= 1; p--) {
            if (p % 3 == 0) {
                System.out.println(p + ". saya angkatan 33");
            } else if (p % 2 == 0) {
                System.out.println(p + ". saya anak moklet");
            } else {
                System.out.println(p + ". saya anak wikusama");
            }
        }   
        System.out.println("1. saya senang");
    }
}