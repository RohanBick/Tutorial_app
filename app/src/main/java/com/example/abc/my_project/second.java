package com.example.abc.my_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class second extends AppCompatActivity
{
    Button button23,button24,button25,button26;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button23=findViewById(R.id.button23);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy=new Intent(second.this,Micro_pro.class);
                startActivity(toy);
            }
        });

        button24=findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy=new Intent(second.this,op_sys.class);
                startActivity(toy);
            }
        });

        button25=findViewById(R.id.button25);
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy=new Intent(second.this,Toc_comp.class);
                startActivity(toy);
            }
        });

        button26=findViewById(R.id.button26);
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy=new Intent(second.this,Image_pro.class);
                startActivity(toy);
            }
        });

    }
}
