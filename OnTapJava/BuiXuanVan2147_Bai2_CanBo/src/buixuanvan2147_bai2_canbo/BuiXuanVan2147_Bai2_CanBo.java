/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buixuanvan2147_bai2_canbo;

import Model.QuanLyCanBo;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BuiXuanVan2147_Bai2_CanBo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

		QuanLyCanBo qlcb_147 = new QuanLyCanBo();

		qlcb_147.nhapDanhSach(sc);

		System.out.print("Nhap vao ho ten can tim kiem: ");
		String name = sc.nextLine();

		qlcb_147.timKiemCanBo(name);

		// huy sc
		sc.close();
    }
    
}
