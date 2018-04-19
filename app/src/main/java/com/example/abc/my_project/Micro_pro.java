package com.example.abc.my_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Micro_pro extends AppCompatActivity {
    Button button6,button7,button8,button9,button10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_micro_pro);

        button6=findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(Micro_pro.this,Details.class);
                in.putExtra("title",button6.getText().toString());
                startActivity(in);
            }
        });

        button7=findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(Micro_pro.this,Details.class);
                in.putExtra("title",button7.getText().toString());
                startActivity(in);
            }
        });

        button8=findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(Micro_pro.this,Details.class);
                in.putExtra("title",button8.getText().toString());
                startActivity(in);
            }
        });

        button9=findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(Micro_pro.this,Details.class);
                in.putExtra("title",button9.getText().toString());
                startActivity(in);
            }
        });

        button10=findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(Micro_pro.this,Details.class);
                in.putExtra("title",button10.getText().toString());
                startActivity(in);
            }
        });

    }
}
