package com.example.group2sw4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class GroupMembersActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    ProfileAdapter profileAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_members);
        recyclerView = findViewById(R.id.profileRecyclerView);
        layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        String names[] = getResources().getStringArray(R.array.names);
        int images[] = {R.drawable.exe, R.drawable.ella, R.drawable.jazer, R.drawable.jomar, R.drawable.michelle, R.drawable.zyra};
        profileAdapter = new ProfileAdapter(names, images);
        recyclerView.setAdapter(profileAdapter);
        recyclerView.setHasFixedSize(true);
    }

    public void profileClick(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        TextView textView = view.findViewById(R.id.profileNameTextView);
        String name = textView.getText().toString();
        intent.putExtra("name", name);
        startActivity(intent);
    }
}