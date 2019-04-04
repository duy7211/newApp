package com.example.newapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton btnToggle;
    TextView viewToggle,tvsw;
    Switch sw1;
    CheckBox cbBongda, cbBongchuyen,cbCaulong;
    RadioGroup radiobtn;
    RadioButton radiobtnNam, radiobtnNu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        togleButton();
        sw();
        checkbox();
        radiobtn();
    }

    public void radiobtn() {
        radiobtn.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radiobtnNam){
                    Toast.makeText(MainActivity.this, "Bạn chọn giới tính Nam", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Bạn chọn giới tính Nữ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void checkbox() {
        cbBongda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean state = cbBongda.isChecked();
                if(state){
                    Toast.makeText(MainActivity.this, "Chọn bóng đá", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Bỏ chọn bóng đá", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cbBongchuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean state = cbBongchuyen.isChecked();
                if(state){
                    Toast.makeText(MainActivity.this, "Chọn bóng chuyền", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Bỏ chọn bóng chuyền", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cbCaulong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean state = cbCaulong.isChecked();
                if(state){
                    Toast.makeText(MainActivity.this, "Chọn cầu lông", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Bỏ chọn cầu lông", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void sw() {
        sw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean state = sw1.isChecked();
                if(state){
                    Toast.makeText(MainActivity.this, "Mở", Toast.LENGTH_SHORT).show();
                    tvsw.setText("Switch được mở");
                }else{
                    Toast.makeText(MainActivity.this, "Đóng", Toast.LENGTH_SHORT).show();
                    tvsw.setText("Switch được đóng");
                }
            }
        });
    }

    public void togleButton() {
        btnToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean state = btnToggle.isChecked();
                if(state){
                    Toast.makeText(MainActivity.this, "Mở", Toast.LENGTH_SHORT).show();
                    viewToggle.setEnabled(true);
                } else {
                    Toast.makeText(MainActivity.this, "Đóng", Toast.LENGTH_SHORT).show();
                    viewToggle.setEnabled(false);
                }
            }
        });
    }

    public void init() {
        btnToggle = findViewById(R.id.btnToggle);
        viewToggle = findViewById(R.id.viewToggle);
        sw1 = findViewById(R.id.sw1);
        tvsw = findViewById(R.id.tvsw);
        cbBongda = findViewById(R.id.cbBongda);
        cbBongchuyen = findViewById(R.id.cbBongchuyen);
        cbCaulong = findViewById(R.id.cbCaulong);
        radiobtn = findViewById(R.id.radiobtn);
        radiobtnNam = findViewById(R.id.radiobtnNam);
        radiobtnNu = findViewById(R.id.radiobtnNu);
    }
}
