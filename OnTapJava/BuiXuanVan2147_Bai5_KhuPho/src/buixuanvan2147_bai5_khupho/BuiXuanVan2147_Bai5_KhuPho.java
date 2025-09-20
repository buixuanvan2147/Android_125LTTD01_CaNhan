/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buixuanvan2147_bai5_khupho;

import Class.KhuPho;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BuiXuanVan2147_Bai5_KhuPho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        KhuPho qlkp = new KhuPho();

        qlkp.nhapDanhSach(sc);

        System.out.println("Danh sach ho dan co nguoi 80 tuoi la:");
        qlkp.timKiemThongTin();

    }
    
}
