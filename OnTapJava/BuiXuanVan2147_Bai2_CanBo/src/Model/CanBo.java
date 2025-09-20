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
public class CanBo {
    // thuoc tinh
	private String hoTen_147;
	private String ngaySinh_147;
	private String gioiTinh_147;
	private String diaChi_147;

	// phuong thuc
	// ham khoi tao khong doi so
	public CanBo() {

	}

	// ham khoi tao co doi so
	public CanBo(String hoten, String ngaySinh, String gioiTinh, String diaChi) {
		this.hoTen_147 = hoten;
		this.ngaySinh_147 = ngaySinh;
		this.gioiTinh_147 = gioiTinh;
		this.diaChi_147 = diaChi;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen_147 = sc.nextLine();
		System.out.print("\tNhap ngay sinh (dd/MM/yyyy): ");
		ngaySinh_147 = sc.nextLine();
		System.out.print("\tNhap gioi tinh: ");
		gioiTinh_147 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi_147 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_147);
		System.out.println("\tNgay sinh: " + ngaySinh_147);
		System.out.println("\tGioi tinh: " + gioiTinh_147);
		System.out.println("\tDia chi: " + diaChi_147);
	}

	// ham lay thong tin ho ten
	public String getHoTen() {
		return this.hoTen_147;
	}

}
