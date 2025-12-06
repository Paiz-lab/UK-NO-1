/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklno1;

/**
 *
 * @author LOQ
 */

import java.util.Scanner;

public class UKLNO1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.print("Masukkan jumlah elemen Fibonacci: ");
       
        int n = input.nextInt();
         System.out.print("Masukkan jumlah elemen awal: ");
        int a = input.nextInt();
        System.out.print("Masukkan jumlah elemen ke dua: ");
        int b = input.nextInt();
        int ganjil = 0, genap = 0;
        
        System.out.print("Deret Fibonacci: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            if (a % 2 == 0) {
                genap++;
            } else {
                ganjil++;
            }

            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println("\n=================================");
        System.out.println("Jumlah bilangan genap : " + genap);
        System.out.println("Jumlah bilangan ganjil: " + ganjil);
    }
}
