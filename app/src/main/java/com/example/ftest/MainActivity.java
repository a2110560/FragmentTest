package com.example.ftest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnf1,btnf2,btnf3;
    private FragmentManager fragmentManager;
    private F1Fragment f1Fragment;
    private F2Fragment f2Fragment;
    private F3Fragment f3Fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager=getSupportFragmentManager();
        f1=new F1Fragment();
        f2=new F2Fragment();
        f3=new F3Fragment();

        FragmentTransaction transaction=fragmentManager.beginTransaction();//會開始交易行為(fragment切換)
        transaction.add(R.id.container,f1Fragment);//將f1fragment放入container
        transaction.commit();//必須加這行完成交易手續
        btnf1=findViewById(R.id.gotof1);
        btnf2=findViewById(R.id.gotof2);
        btnf3=findViewById(R.id.gotof3);
        btnf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}