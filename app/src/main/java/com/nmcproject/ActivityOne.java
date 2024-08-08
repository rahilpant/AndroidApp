package com.nmcproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityOne extends AppCompatActivity {
    Button btnsend,btnSendBack;
    EditText firstName;

    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        btnsend = findViewById(R.id.btnSend);
        firstName = findViewById(R.id.txtFirstName);
        result = findViewById(R.id.lblResult);
        btnSendBack = findViewById(R.id.btnSendBack);
        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = firstName.getText().toString();
                Intent intent = new Intent(ActivityOne.this,ActivityTwo.class);
                intent.putExtra("fname",fname);
                startActivity(intent);
            }
        });

        btnSendBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(ActivityOne.this,ActivityTwo.class);
                String fname = firstName.getText().toString();
                intent.putExtra("fname",fname);
                startActivityForResult(intent,100);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100){
            String message=data.getStringExtra("lastname");
            result.setText(message);
            Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();
        }
    }
}
