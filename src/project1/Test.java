/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.Scanner;
import static project1.Algoritma.perkalianLoop;

/**
 *
 * @author X453MA
 */
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Algoritma algoritma = new Algoritma();
        System.out.print("Masukkan angka-1 : ");
        int angka1 = in.nextInt();
        System.out.print("Masukkan angka-2 : ");
        int angka2 = in.nextInt();
        System.out.println("Hasil : " + algoritma.perkalianLoop(angka1, angka2));
    }
}
