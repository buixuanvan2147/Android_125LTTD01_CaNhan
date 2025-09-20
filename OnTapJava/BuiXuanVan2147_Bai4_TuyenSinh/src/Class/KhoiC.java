package Class;

import java.util.Scanner;

public class KhoiC extends ThiSinh {
	// thuoc tinh
	private double Van_147;
	private double Su_147;
	private double Dia_147;

	// phuong thuc
	// ham khoi tao khong doi so
	public KhoiC() {

	}

	// ham khoi tao co doi so
	public KhoiC(double mon1, double mon2, double mon3) {
		this.Van_147 = mon1;
		this.Su_147 = mon2;
		this.Dia_147 = mon3;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap diem van: ");
		Van_147 = sc.nextDouble();
		System.out.print("\tNhap diem su: ");
		Su_147 = sc.nextDouble();
		System.out.print("\tNhap diem dia: ");
		Dia_147 = sc.nextDouble();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tTo hop mon thi: Van - " + Van_147 + ", Su - " + Su_147 + ", Dia - " + Dia_147);
	}
}
