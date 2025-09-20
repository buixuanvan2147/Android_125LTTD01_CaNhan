/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buixuanvan2147_bai9_thuvien;
import java.util.Scanner;
import Class.QuanLy;
/**
 *
 * @author Admin
 */
public class BuiXuanVan2147_Bai9_ThuVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        QuanLy ql = new QuanLy();

        ql.nhapDanhSach(sc);

        System.out.println("Danh sach sinh vien tra sach vao cuoi thang:");
        ql.hienThiDanhSachTraCuoiThang();

        sc.close();
    }

}
