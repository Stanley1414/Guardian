package com.example.teamguardians;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton NewPatientButton = findViewById(R.id.NewPatientButton);
        NewPatientButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent NewPatientIntent = new Intent(HomeActivity.this, NewPatientActivity.class);
                startActivity(NewPatientIntent);
            }
        });
    }


}