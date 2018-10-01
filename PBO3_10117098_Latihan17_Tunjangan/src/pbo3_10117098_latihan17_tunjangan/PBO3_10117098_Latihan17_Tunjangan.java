/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan17_tunjangan;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : Program ini berisi program untuk menghitung total gaji
 *                     yang terdiri dari gaji pokok dan tunjangan 35%
 */
public class PBO3_10117098_Latihan17_Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tunjangan, gajiPokok, totalGaji;
        String status;
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("=========== Program Tunjangan ===========");
        System.out.print("Berapa gaji pokok anda perbulan : Rp. ");
        gajiPokok = scn.nextDouble();
        
        System.out.print("Status Anda? (Menikah/Belum)\t: ");
        status = scn.next();
        
        tunjangan =(status.equals("Menikah")?0.35*gajiPokok:0);

        totalGaji = gajiPokok + tunjangan;
        
        System.out.println("");
        System.out.println("====== Hasil Perhitungan Gaji Anda ======");
        System.out.println("Gaji Pokok\t : Rp "+gajiPokok);
        System.out.println("Tunjangan\t : Rp "+tunjangan);
        System.out.println("Total gaji\t : Rp "+totalGaji);
    }
    
}
