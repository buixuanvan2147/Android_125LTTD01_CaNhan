/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buixuanvan2147_bai10_bienlaitiendien;
import java.util.Scanner;
import BuildClass.QuanLy;

/**
 *
 * @author Admin
 */
public class BuiXuanVan2147_Bai10_BienLaiTienDien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        QuanLy ql = new QuanLy();
        ql.nhapDanhSach(sc);

        System.out.println("Danh sach bien lai cua cac ho gia dinh la:");
        ql.hienThiDanhSach();

        sc.close();
    }
    
}
