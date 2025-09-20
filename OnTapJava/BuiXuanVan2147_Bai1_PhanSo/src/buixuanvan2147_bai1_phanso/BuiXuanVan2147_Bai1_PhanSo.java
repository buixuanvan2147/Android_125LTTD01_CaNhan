/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buixuanvan2147_bai1_phanso;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BuiXuanVan2147_Bai1_PhanSo {

    // thuoc tinh
    private int tuSo147;
    private int mauSo147;
    
    //phuong thuc
    // Ham khoi tao khong doi so
    public BuiXuanVan2147_Bai1_PhanSo(){
        tuSo147 = 0;
        mauSo147 = 1;
    }
    
    //Ham khoi tao co doi so
    public BuiXuanVan2147_Bai1_PhanSo(int tuSo147, int mauSo147){
        this.tuSo147 = tuSo147;
        this.mauSo147 = mauSo147;
    }
    
    // Ham nhap phan so
    public void nhapPhanSo(Scanner sc){
        int a147, b147;
        do
        {
            System.out.print("      Nhap vao tu so: ");
            a147 = sc.nextInt();
            
            System.out.print("      Nhap vao mau so: ");
            b147 = sc.nextInt();
            
            //kiem tra
            if(b147 == 0){
                System.out.print("\nMau so khong duoc bang 0. Hay nhap lai!");
            }else{
                tuSo147 = a147;
                mauSo147 = b147;
            }
        }
        while(b147 == 0);
    }
    
    // Ham hien thi phan so
    public void hienThiPhanSo(){
        if(tuSo147 * mauSo147 < 0){
            System.out.print("-"+Math.abs(tuSo147)+"/"+Math.abs(mauSo147));
        }else{
            System.out.print(Math.abs(tuSo147)+"/"+Math.abs(mauSo147));
        }
    }
    
    //Ham cong hai phan so
    public BuiXuanVan2147_Bai1_PhanSo congHaiPhanSo(BuiXuanVan2147_Bai1_PhanSo psHai){
        int tuSoMoi147 = tuSo147*psHai.mauSo147 + psHai.tuSo147*mauSo147;
        int mauSoMoi147 = mauSo147 * psHai.mauSo147;
        
        return new BuiXuanVan2147_Bai1_PhanSo(tuSoMoi147, mauSoMoi147);
    }
    
    //Ham tru hai phan so
    public BuiXuanVan2147_Bai1_PhanSo truHaiPhanSo(BuiXuanVan2147_Bai1_PhanSo psHai){
        int tuSoMoi147 = tuSo147*psHai.mauSo147 - psHai.tuSo147*mauSo147;
        int mauSoMoi147 = mauSo147 * psHai.mauSo147;
        
        return new BuiXuanVan2147_Bai1_PhanSo(tuSoMoi147, mauSoMoi147);
    }
    
    //Ham nhan hai phan so
    public BuiXuanVan2147_Bai1_PhanSo nhanHaiPhanSo(BuiXuanVan2147_Bai1_PhanSo psHai){
        int tuSoMoi147 =  tuSo147 * psHai.tuSo147;
        int mauSoMoi147 = mauSo147 * psHai.mauSo147;
        
        return new BuiXuanVan2147_Bai1_PhanSo(tuSoMoi147, mauSoMoi147);
    }
    
    //Ham chia hai phan so
    public BuiXuanVan2147_Bai1_PhanSo chiaHaiPhanSo(BuiXuanVan2147_Bai1_PhanSo psHai){
        int tuSoMoi147 =  tuSo147 * psHai.mauSo147;
        int mauSoMoi147 = mauSo147 * psHai.tuSo147;
        
        return new BuiXuanVan2147_Bai1_PhanSo(tuSoMoi147, mauSoMoi147);
    }
    
    //Ham tim USCLN
    public int timUSCLN(int a_147, int b_147){
        int a147 = Math.abs(a_147);
        int b147 = Math.abs(b_147);
        int r147 = a147 % b147;
        
        while(r147 !=0){
            a147 = b147;
            b147 = r147;
            r147 = a147 % b147;
        }
        
        return b147;
    }
    
    //Ham kiem tra phan so toi gian hay chua
    public boolean kiemTraPhanSoToiGian(){
        if(timUSCLN(tuSo147, mauSo147) == 1){
            return true;
        }
        return false;
    }
    
    //Ham toi gian phan so
    public void toiGianPhanSo(){
        int x147 = timUSCLN(tuSo147, mauSo147);
        tuSo147 = tuSo147 / x147;
        mauSo147 = mauSo147 / x147;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BuiXuanVan2147_Bai1_PhanSo ps1_147 = new BuiXuanVan2147_Bai1_PhanSo();
        BuiXuanVan2147_Bai1_PhanSo ps2_147 = new BuiXuanVan2147_Bai1_PhanSo();
        BuiXuanVan2147_Bai1_PhanSo tongPS_147 = new BuiXuanVan2147_Bai1_PhanSo();
        BuiXuanVan2147_Bai1_PhanSo truPS_147 = new BuiXuanVan2147_Bai1_PhanSo();
        BuiXuanVan2147_Bai1_PhanSo nhanPS_147 = new BuiXuanVan2147_Bai1_PhanSo();
        BuiXuanVan2147_Bai1_PhanSo chiaPS_147 = new BuiXuanVan2147_Bai1_PhanSo();
        
        //Nhap phan so
        System.out.println("\nNhap vao phan so thu nhat:");
        ps1_147.nhapPhanSo(sc);
        System.out.println("\nNhap vao phan so thu hai:");
        ps2_147.nhapPhanSo(sc);
        
        System.out.print("------------");
        
        //Hien thi phan so
        System.out.print("\nPhan so thu nhat la: ");
        ps1_147.hienThiPhanSo();
        System.out.print("\nPhan so thu hai la: ");
        ps2_147.hienThiPhanSo();
        
        System.out.print("\n------------");
        
        //Tong hai phan so
        tongPS_147 = ps1_147.congHaiPhanSo(ps2_147);
        System.out.print("\nTong hai phan so la: ");
        tongPS_147.hienThiPhanSo();
        
        //Tru hai phan so
        truPS_147 = ps1_147.truHaiPhanSo(ps2_147);
        System.out.print("\nHieu hai phan so la: ");
        truPS_147.hienThiPhanSo();
        
        //Nhan hai phan so
        nhanPS_147 = ps1_147.nhanHaiPhanSo(ps2_147);
        System.out.print("\nTich hai phan so la: ");
        nhanPS_147.hienThiPhanSo();
        
        //Chia hai phan so
        chiaPS_147 = ps1_147.chiaHaiPhanSo(ps2_147);
        System.out.print("\nThuong hai phan so la: ");
        chiaPS_147.hienThiPhanSo();
        
        System.out.print("\n------------");
        
        //Tim uoc so chung lon nhat
        int uscln1 = ps1_147.timUSCLN(ps1_147.tuSo147, ps1_147.mauSo147);
        System.out.println("\nUSCLN cua phan so thu nhat la: " + uscln1);
        int uscln2 = ps1_147.timUSCLN(ps2_147.tuSo147, ps2_147.mauSo147);
        System.out.println("USCLN cua phan so thu hai la: " + uscln2);
        
        System.out.print("------------");
        
        //Kiem tra toi gian hay chua
        if(ps1_147.kiemTraPhanSoToiGian()){
            System.out.println("\nPhan so thu nhat da toi gian!");
            ps1_147.hienThiPhanSo();
        }else{
            System.out.print("\nPhan so thu nhat chua toi gian");
            System.out.print("\nPhan so sau khi toi gian la: ");
            ps1_147.toiGianPhanSo();
            ps1_147.hienThiPhanSo();
        }
        
        if(ps2_147.kiemTraPhanSoToiGian()){
            System.out.println("\n\nPhan so thu hai da toi gian!");
            ps2_147.hienThiPhanSo();
        }else{
            System.out.print("\n\nPhan so thu hai chua toi gian");
            System.out.print("\nPhan so sau khi toi gian la: ");
            ps2_147.toiGianPhanSo();
            ps2_147.hienThiPhanSo();
        }
        
        // Xac dinh ham toi gian
        System.out.print("\n------------\n");
        sc.close();
    }
    
}
