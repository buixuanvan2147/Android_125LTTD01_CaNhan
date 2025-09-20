package Class;

import java.util.Scanner;

public class ThiSinh {
	// thuoc tinh
	private int soBD_147;
	private String hoTen_147;
	private String diaChi_147;
	private String dienUuTien_147;

	// phuong thuc
	// ham khoi tao khong doi so
	public ThiSinh() {

	}

	// ham khoi tao co doi so
	public ThiSinh(int soBD, String hoTen, String diaChi, String dienUuTien) {
		this.soBD_147 = soBD;
		this.hoTen_147 = hoTen;
		this.diaChi_147 = diaChi;
		this.dienUuTien_147 = dienUuTien;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so bao danh: ");
		soBD_147 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ho ten: ");
		hoTen_147 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi_147 = sc.nextLine();
		System.out.print("\tNhap dien uu tien: ");
		dienUuTien_147 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tSo bao danh: " + soBD_147);
		System.out.println("\tHo ten: " + hoTen_147);
		System.out.println("\tDia chi: " + diaChi_147);
		System.out.println("\tDien uu tien: " + dienUuTien_147);
	}

	// ham lay ra thong tin ve so bao danh
	public int getSoBD() {
		return soBD_147;
	}
}
