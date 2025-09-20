package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
	// thuoc tinh
	private ArrayList<ThiSinh> dsts;

	// phuong thuc
	public TuyenSinh() {
		dsts = new ArrayList<ThiSinh>(10);
	}

	// ham them 1 thi sinh
	public void themThiSinh(ThiSinh ts) {
		dsts.add(ts);
	}

	// nhap danh sach
	public void nhapDanhSach(Scanner sc) {
		ThiSinh ts;
		int chon;

		System.out.print("\tNhap vao so luong thi sinh: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.print("\n\tThi sinh thuoc khoi nao (1-KhoiA; 2-KhoiB; 3-KhoiC): ");
			chon = sc.nextInt();

			switch (chon) {
			case 1:
				ts = new KhoiA(0,0,0);
				break;
			case 2:
				ts = new KhoiB(0,0,0);
				break;
			case 3:
				ts = new KhoiC(0,0,0);
				break;
			default:
				ts = new KhoiA(0,0,0);
				break;
			}
                        System.out.println("");
			ts.nhapThongTin(sc);
			themThiSinh(ts);
		}
	}

	// ham hien thi
	public void hienThiDanhSach() {
		int n = dsts.size();
		for (int i = 0; i < n; i++) {
			System.out.println("Thi sinh thu " + (i + 1) + " la:");
			dsts.get(i).hienThiThongTin();
		}
	}

	// tim kiem thi sinh theo so bao danh
	public void timKiemThiSinh(int soBaoDanh) {
		for (ThiSinh ts : dsts) {
			if (ts.getSoBD() == soBaoDanh) {
				ts.hienThiThongTin();
			}
		}
	}
}
