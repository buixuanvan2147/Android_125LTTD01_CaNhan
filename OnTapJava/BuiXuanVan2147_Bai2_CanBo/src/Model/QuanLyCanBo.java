/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class QuanLyCanBo {
    // thuoc tinh
	private ArrayList<CanBo> dscb_147;

	// phuong thuc
	// ham khoi tao
	public QuanLyCanBo() {
		dscb_147 = new ArrayList<CanBo>(10);
	}

	// ham them can bo
	public void themCanBo(CanBo cb) {
		dscb_147.add(cb);
	}

	// ham nhap danh sach
	public void nhapDanhSach(Scanner sc) {
		CanBo cb_147;
		System.out.print("Nhap vao so luong can bo: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap thong tin chi tiet:");
		for (int i = 0; i < n; i++) {
			System.out.println("Lan nhap thu " + (i + 1) + ":");
			System.out.print("Chon can bo (1-KySu; 2-NhanVien;3-CongNhan): ");
			int chon = sc.nextInt();
			sc.nextLine();

			cb_147 = new CanBo();

			switch (chon) {
			case 1:
				cb_147 = new KySu();
				break;
			case 2:
				cb_147 = new NhanVien();
				break;
			case 3:
				cb_147 = new CongNhan();
				break;

			default:
				cb_147 = new KySu();
				break;
			}

			// sau khi chon loai can bo thi nhap thong tin cho can bo do
			cb_147.nhapThongTin(sc);

			// nhap xong roi thi them can bo vao danh sach
			themCanBo(cb_147);
		}
	}

	// ham tim kiem theo ten
	public void timKiemCanBo(String hoTen) {
		for (CanBo cb : dscb_147) {
			if (hoTen.equals(cb.getHoTen())) {
				cb.hienThiThongTin();
			}
		}
	}

}
