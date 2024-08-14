package com.nmcproject;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class RecyclerViewExample extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_example);

        recyclerView = findViewById(R.id.recyclerview);
        //creating array
        String[] name = {
                "Ram", "Shyam", "Hari",
                "Gita", "Sita","Rahil","Ahbi"
        };
        String[] address = {
                "Birtamode", "Kathmandu", "Pokhara",
                "Birtamode", "Kathmandu","Kathmandu","Kathmandu"
        };
        int[] image = {
                R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background
        };
        //setting layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        //passing array to Adapter class
        adapter = new RecyclerViewAdapter(this, name, address, image);
        recyclerView.setAdapter(adapter);
    }
}