package com.example.groupparkingassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ParkingSlotDetail extends AppCompatActivity {
    String parkName;
    TextView parkingTxt;
    Button bookBtn;
    ImageView backBtn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_slot_detail);

        parkName = getIntent().getStringExtra("parkname");
        parkingTxt = findViewById(R.id.parkingText);
        bookBtn = findViewById(R.id.button);
        backBtn = findViewById(R.id.back);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ParkingSlotDetail.this, MainActivity.class);
                startActivity(intent);
            }
        });
        bookBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ParkingSlotDetail.this, "You have booked for: " + parkName + "parking. Ensure to pay first before arrival.", Toast.LENGTH_LONG).show();
            }
        });

        parkingTxt.setText(parkName);
    }
}