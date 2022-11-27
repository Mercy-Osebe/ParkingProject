package com.example.groupparkingassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LandingPageActivity extends AppCompatActivity {
    EditText nameText;
    Button btnYes;
    Button btnNo;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
        btnYes=findViewById(R.id.yes);
        btnNo=findViewById(R.id.no);
        nameText=findViewById(R.id.nameText);
        name=nameText.getText().toString();
        System.out.println(name);
        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LandingPageActivity.this, "Thank you for visiting this application", Toast.LENGTH_SHORT).show();
            }
        });
        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                intent.putExtra("name",name);
                startActivity(intent);
            }
        });

    }
}