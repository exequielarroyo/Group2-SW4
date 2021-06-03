package com.example.group2sw4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.searchFBEditText).setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                LottieAnimationView lottieAnimationView = findViewById(R.id.checkFBButton);
                lottieAnimationView.setVisibility(View.VISIBLE);
            }
        });

        findViewById(R.id.searchGoogleEditText).setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                View view = findViewById(R.id.checkGoogleButton);
                view.setVisibility(View.VISIBLE);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.sourceCodeOptionItem) {

        } else if (id == R.id.followUsMenuItem) {
            Intent intent = new Intent(this, FollowUsActivity.class);
            startActivity(intent);

        } else if (id == R.id.groupMemberMenuItem) {
            Intent intent = new Intent(this, GroupMembersActivity.class);
            startActivity(intent);

        } else if (id == R.id.exitMenuItem) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Do you want to exit?");
            builder.setCancelable(true);
            builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            return true;

        }
        return super.onOptionsItemSelected(item);
    }

    public void checkClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.checkGoogleButton:
                EditText editText = findViewById(R.id.searchGoogleEditText);
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=" + editText.getText()));
                break;
            case R.id.checkFBButton:
                EditText editText2 = findViewById(R.id.searchFBEditText);
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/search/top?q=" + editText2.getText()));
                break;
            default:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com"));
                break;
        }
        startActivity(intent);
    }
}