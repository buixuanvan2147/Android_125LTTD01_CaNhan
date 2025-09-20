/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buixuanvan2147_bai4_tuyensinh;

import Class.TuyenSinh;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BuiXuanVan2147_Bai4_TuyenSinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

                TuyenSinh dsTuyenSinh = new TuyenSinh();

		System.out.println("\n1. Nhap vao danh sach thi sinh: ");
		dsTuyenSinh.nhapDanhSach(sc);

		System.out.println("\n2. Danh sach thi sinh du thi la:");
		dsTuyenSinh.hienThiDanhSach();

		System.out.print("\n3. Nhap so bao danh can tim: ");
		int soBaoDanh = sc.nextInt();
		sc.nextLine();

		dsTuyenSinh.timKiemThiSinh(soBaoDanh);

		sc.close();

    }
    
}
