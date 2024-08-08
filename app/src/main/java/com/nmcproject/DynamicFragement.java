package com.nmcproject;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;



public class DynamicFragement extends AppCompatActivity {
    Button btnFrag1, btnFrag2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_fragement);

        btnFrag1 = findViewById(R.id.btnFirst);
        btnFrag2 = findViewById(R.id.btnSecond);

        btnFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment1 first = new Fragment1();
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.myfragment,first);
                ft.commit();
            }
        });
        btnFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment2 second = new Fragment2();
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.myfragment2,second);
                ft.commit();
            }
        });

    }
}