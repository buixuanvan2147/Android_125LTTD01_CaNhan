/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buixuanvan2147_bai3_tailieu;

import Model.QuanLySach;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BuiXuanVan2147_Bai3_TaiLieu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

                QuanLySach qls_147 = new QuanLySach();

		qls_147.nhapDanhSachTL(sc);

		System.out.print("\n\nNhap vao loai tai lieu can tim: ");
		String loai_147 = sc.nextLine();
		qls_147.timLoaiTL(loai_147);

		System.out.print("\n\nNhap vao ma tai lieu can tim: ");
		String maTL = sc.nextLine();
		qls_147.timMaTL(maTL);

		sc.close();

    }
    
}
