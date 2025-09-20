package Model;

import java.util.Scanner;

public class TaiLieu {
	// thuoc tinh
	private String maTaiLieu_147;
	private String tenNXB_147;
	private int soBanPhatHanh_147;

	// phuong thuc
	// ham khoi tao khong doi so
	public TaiLieu() {

	}

	// ham khoi tao co doi so
	public TaiLieu(String maTaiLieu, String tenNXB, int soBanPhatHanh) {
		this.maTaiLieu_147 = maTaiLieu;
		this.tenNXB_147 = tenNXB;
		this.soBanPhatHanh_147 = soBanPhatHanh;
	}

	// nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ma tai lieu: ");
		maTaiLieu_147 = sc.nextLine();
		System.out.print("\tNhap ten nha xuat ban: ");
		tenNXB_147 = sc.nextLine();
		System.out.print("\tNhap so ban phat hanh: ");
		soBanPhatHanh_147 = sc.nextInt();
		sc.nextLine();
	}

	// hien thi
	public void hienThiThongTin() {
		System.out.println("\tMa tai lieu: " + maTaiLieu_147);
		System.out.println("\tTen nha xuat ban: " + tenNXB_147);
		System.out.println("\tSo ban phat hanh: " + soBanPhatHanh_147);
	}

	// ham lay ra ma tai lieu
	public String getMaTaiLieu() {
		return maTaiLieu_147;
	}
}
