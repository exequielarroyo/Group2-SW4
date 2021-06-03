package com.example.group2sw4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class FollowUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follow_us);


    }

    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.exeFBTextView:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/exequielarroyo2/"));
                break;
            case R.id.exeInstagramTextView:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/exequielarroyo1/"));
                break;
            case R.id.ellaFBTextView:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ellajane.espiritu.7"));
                break;
            case R.id.ellaInstagramTextView:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/espirituellajane/"));
                break;
            case R.id.jazerFBTextView:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/albalate.jazer/"));
                break;
            case R.id.jazerInstagramTextView:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/mr.albalate/"));
                break;
            case R.id.jomarFBTextView:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Luutherr/"));
                break;
            case R.id.michelleFBTextView:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/michelle.arroyo.1800/"));
                break;
            case R.id.michelleInstagramTextView:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/michellepujjj/"));
                break;
            case R.id.zyraFBTextView:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/zyrarms/"));
                break;
            case R.id.zyraInstagramTextView:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/zyrarms/"));
                break;
            default:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"));
                break;
        }
        startActivity(intent);
    }
}