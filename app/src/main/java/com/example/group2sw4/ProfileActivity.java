package com.example.group2sw4;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    ImageView pictureImageView;
    TextView fullnameTextView;
    TextView birthdayTextView;
    TextView emailTextView;
    ImageView imageProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        pictureImageView = findViewById(R.id.pictureImageView);
        fullnameTextView = findViewById(R.id.fullnameTextView);
        birthdayTextView = findViewById(R.id.birthdayTextView);
        emailTextView = findViewById(R.id.emailTextView);
        imageProfile = findViewById(R.id.imageProfile);

        String name = getIntent().getStringExtra("name");
        switch (name) {
            case "Exequiel Arroyo":
                pictureImageView.setImageResource(R.drawable.exe);
                imageProfile.setImageResource(R.drawable.exe);
                fullnameTextView.setText("Exequiel Arroyo");
                birthdayTextView.setText("November 12, 2000");
                emailTextView.setText("zekielarroyo@gmail.com");
                break;
            case "Ella Jane Espiritu":
                pictureImageView.setImageResource(R.drawable.ella);
                fullnameTextView.setText("Ella Jane Espiritu");
                birthdayTextView.setText("August 12, 2001");
                emailTextView.setText("janeellaellajane@gmail.com");
                imageProfile.setImageResource(R.drawable.ella);
                break;
            case "Mher Jazer Alabalate":
                pictureImageView.setImageResource(R.drawable.jazer);
                fullnameTextView.setText("Mher Jazer Alabalate");
                birthdayTextView.setText("April 06, 2001");
                emailTextView.setText("albalate.jazer@gmail.com");
                imageProfile.setImageResource(R.drawable.jazer);
                break;
            case "Jomar Apalat":
                pictureImageView.setImageResource(R.drawable.jomar);
                fullnameTextView.setText("Jomar Apalat");
                birthdayTextView.setText("June 29, 2000");
                emailTextView.setText("sanitizer1014@gmail.com");
                imageProfile.setImageResource(R.drawable.jomar);
                break;
            case "Michelle Arroyo":
                pictureImageView.setImageResource(R.drawable.michelle);
                fullnameTextView.setText("Michelle Arroyo");
                birthdayTextView.setText("November 22, 2000");
                emailTextView.setText("arroyomichelle54@gmail.com");
                imageProfile.setImageResource(R.drawable.michelle);
                break;
            case "Zyra Marie Ramos":
                pictureImageView.setImageResource(R.drawable.zyra);
                fullnameTextView.setText("Zyra Marie Ramos");
                birthdayTextView.setText("September 13, 1999");
                emailTextView.setText("zairiray13@gmail.com");
                imageProfile.setImageResource(R.drawable.zyra);
                break;
        }
    }
}