/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class KySu extends CanBo{
    // thuoc tinh
	private String nganhDaoTao_147;

	// phuong thuc
	// ham khoi tao khong doi so
	public KySu() {

	}

	// ham khoi tao co doi so
	public KySu(String hoten, String ngaySinh, String gioiTinh, String diaChi, String nganhDaoTao) {
		super(hoten, ngaySinh, gioiTinh, diaChi);
		this.nganhDaoTao_147 = nganhDaoTao;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap nganh dao tao: ");
		nganhDaoTao_147 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tNganh dao tao: " + nganhDaoTao_147);
	}
}
