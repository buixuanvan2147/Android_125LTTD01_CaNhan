package com.example.baitaptaohaimanhinh;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

/**
 * Man hinh Welcome: 2 nut "Dang nhap" va "Tao tai khoan".
 * Ten bien dung tieng Viet (khong dau) + comment day du.
 */
public class MainActivity extends AppCompatActivity {

    private MaterialButton nutDangNhap;     // Nút Đăng nhập
    private MaterialButton nutTaoTaiKhoan;  // Nút Tạo tài khoản

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1) Anh xa view tu XML
        nutDangNhap    = findViewById(R.id.nutDangNhap);
        nutTaoTaiKhoan = findViewById(R.id.nutTaoTaiKhoan);

        // 2) Xu ly click: mo man hinh Tao tai khoan
        nutTaoTaiKhoan.setOnClickListener(v -> {
            Intent i = new Intent(this, CreateAccountActivity.class);
            startActivity(i);
        });

        // 3) Demo: tam thoi nut "Dang nhap" cung mo man hinh Tao tai khoan
        nutDangNhap.setOnClickListener(v -> {
            Intent i = new Intent(this, CreateAccountActivity.class);
            startActivity(i);
        });
    }
}