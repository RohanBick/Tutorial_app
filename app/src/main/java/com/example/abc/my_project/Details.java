package com.example.abc.my_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Details extends AppCompatActivity {
    TextView details;
    ProgressBar pro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        String title=getIntent().getStringExtra("title");
        try{getSupportActionBar().setTitle(title);}catch (Exception e){}
        pro=findViewById(R.id.pro);
        details=findViewById(R.id.details);
        (FirebaseDatabase.getInstance().getReference(title.toUpperCase())).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                details.setText(dataSnapshot.getValue().toString());
                pro.setVisibility(View.GONE);
            }
            @Override
            public void onCancelled(DatabaseError error) {}
        });
    }
}
