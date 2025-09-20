package Class;

import java.util.Scanner;

public class KhoiA extends ThiSinh {
	// thuoc tinh
	private double Toan_147;
	private double Ly_147;
	private double Hoa_147;

	// phuong thuc
	// ham khoi tao khong doi so
	public KhoiA() {

	}

	// ham khoi tao co doi so
	public KhoiA(double mon1, double mon2, double mon3) {
		this.Toan_147 = mon1;
		this.Ly_147 = mon2;
		this.Hoa_147 = mon3;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap diem toan: ");
		Toan_147 = sc.nextDouble();
		System.out.print("\tNhap diem ly: ");
		Ly_147 = sc.nextDouble();
		System.out.print("\tNhap diem hoa: ");
		Hoa_147 = sc.nextDouble();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tTo hop mon thi: Toan - " + Toan_147 + ", Ly - " + Ly_147 + ", Hoa - " + Hoa_147);
	}
}
