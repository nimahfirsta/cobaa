package project1;

/**
 *
 * @author X453MA
 */
import java.util.*;

public class Algoritma {

    /**
     *
     * @param a - nilai angka pertama
     * @param b - nilai angka kedua
     * @return hasil perkalian degan tipe integer
     */
    public static float perkalian(float a, float b) {
        float hasil = 0;
        hasil = a * b;
        return hasil;
    }

    /**
     *
     * @param a - nilai angka pertama
     * @param b - nilai angka kedua
     * @return hasil perkalian dengan tipe ineteger
     */
    public static int perkalianLoop(int a, int b) {
        int hasil = 0;
        if ((a > 0 && b > 0) || (a < 0 && b > 0)) {
            for (int i = 0; i < b; i++) {
                hasil = hasil + a;
            }
        } else if (a > 0 && b < 0) {
            for (int i = 0; i < Math.abs(b); i++) {
                hasil = hasil + a;
            }
            hasil = hasil * (-1);
        } else {
            for (int i = 0; i < Math.abs(b); i++) {
                hasil = hasil + Math.abs(a);
                
            }
        }
        return hasil;
    }
    
    /**
     * Function untuk menghitung nominal uang berdasarkan pecahan
     * @param nominal - besar nominal uang yang akan dihitung
     * @return hasil hitung pecahan
     */
    public String HitungPecahan(int nominal){
        String hasil = "";
        String pecahan;
        return hasil;
    }
}
