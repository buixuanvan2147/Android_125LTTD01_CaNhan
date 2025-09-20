/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buixuanvan2147_bai6_khachsan;
import java.util.Scanner;
import Class.KhachSan;
/**
 *
 * @author Admin
 */
public class BuiXuanVan2147_Bai6_KhachSan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

		KhachSan ql = new KhachSan();

		ql.nhapDanhSach(sc);

		System.out.print("Nhap vao khach tro can tinh tien: ");
		int cmnd = sc.nextInt();

		System.out.println("==> Tong tien la: " + ql.tinhTien(cmnd));

		sc.close();
    }
    
}
