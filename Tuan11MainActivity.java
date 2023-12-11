package com.example.myapplication.tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

public class Tuan11MainActivity extends AppCompatActivity {
    // khai bao cac control
    EditText txt1,txt2;
    Button btn1;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan11_main);
        // anh xa cac control
        txt1 = findViewById(R.id.demo11txt1);
        txt2 = findViewById(R.id.demo11txt2);
        btn1 = findViewById(R.id.demo11btn1);
        tv1 = findViewById(R.id.demo11tv1);
        // xu ly
        btn1.setOnClickListener(v->{
            // goi ham tinh tong
            tinhtong();
        });
    }
    // dinh nghia ham tinh tong
    private void tinhtong() {
        // lay du lieu tu edittext1
        String str1 = txt1.getText().toString();
        Float so1 = Float.parseFloat(str1);// chuyen du lieu sang so
        // lay du lieu tu edittext2
        String str2 = txt2.getText().toString();
        Float so2 = Float.parseFloat(str2);
        // tinh tong
        Float tong = so1 + so2;
        // in ket qua
        tv1.setText(String.valueOf(tong));
    }
}