package com.example.abc.my_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Toc_comp extends AppCompatActivity {
    Button button17,button18,button19,button20,button21,button22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toc_comp);

        button17=findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(Toc_comp.this,Details.class);
                in.putExtra("title",button17.getText().toString());
                startActivity(in);
            }
        });

        button18=findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(Toc_comp.this,Details.class);
                in.putExtra("title",button18.getText().toString());
                startActivity(in);
            }
        });

        button19=findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(Toc_comp.this,Details.class);
                in.putExtra("title",button19.getText().toString());
                startActivity(in);
            }
        });

        button20=findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(Toc_comp.this,Details.class);
                in.putExtra("title",button20.getText().toString());
                startActivity(in);
            }
        });

        button21=findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(Toc_comp.this,Details.class);
                in.putExtra("title",button21.getText().toString());
                startActivity(in);
            }
        });

        button22=findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(Toc_comp.this,Details.class);
                in.putExtra("title",button22.getText().toString());
                startActivity(in);
            }
        });
    }
}
