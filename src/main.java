
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Firman
 */
public class main {
    public static void main (String[] args) {
        Scanner scn1 = new Scanner (System.in);
        int y;
        
        System.out.println("===Program Penarikan Uang===");
        System.out.println("Masukan Saldo Awal : ");
        Tabungan tab = new Tabungan(scn1.nextInt());
        System.out.println("Jumlah Uang Yang Diambil : ");
        y = scn1.nextInt();
        System.out.println("Saldo Anda Sekarang : "+tab.ambiluang(y));
        y = scn1.nextInt();
        System.out.println("Saldo Anda Sekarang : "+tab.ambiluang(y));
    }
}
