package Class;

import java.util.Scanner;

public class KhoiB extends ThiSinh {
	// thuoc tinh
	private double Toan_147;
	private double Hoa_147;
	private double Sinh_147;

	// phuong thuc
	// ham khoi tao khong doi so
	public KhoiB() {

	}

	// ham khoi tao co doi so
	public KhoiB(double mon1, double mon2, double mon3) {
		this.Toan_147 = mon1;
		this.Hoa_147 = mon2;
		this.Sinh_147 = mon3;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap diem toan: ");
		Toan_147 = sc.nextDouble();
		System.out.print("\tNhap diem hoa: ");
		Hoa_147 = sc.nextDouble();
		System.out.print("\tNhap diem sinh: ");
		Sinh_147 = sc.nextDouble();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tTo hop mon thi: Toan - " + Toan_147 + ", Hoa - " + Hoa_147 + ", Sinh - " + Sinh_147);
	}
}
