package com.example.abc.my_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class op_sys extends AppCompatActivity {
    Button button11,button12,button13,button14,button15,button16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_op_sys);
        button11=findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(op_sys.this,Details.class);
                in.putExtra("title",button11.getText().toString());
                startActivity(in);
            }
        });

        button12=findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(op_sys.this,Details.class);
                in.putExtra("title",button12.getText().toString());
                startActivity(in);
            }
        });

        button13=findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(op_sys.this,Details.class);
                in.putExtra("title",button13.getText().toString());
                startActivity(in);
            }
        });

        button14=findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(op_sys.this,Details.class);
                in.putExtra("title",button14.getText().toString());
                startActivity(in);
            }
        });

        button15=findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(op_sys.this,Details.class);
                in.putExtra("title",button15.getText().toString());
                startActivity(in);
            }
        });

        button16=findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(op_sys.this,Details.class);
                in.putExtra("title",button16.getText().toString());
                startActivity(in);
            }
        });


    }
}
