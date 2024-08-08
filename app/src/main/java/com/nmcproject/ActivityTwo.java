package com.nmcproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityTwo extends AppCompatActivity {

    TextView txtDisplay;
    EditText txtLname;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        txtDisplay = findViewById(R.id.lblDisplay);
        Intent intent = getIntent();
        String fname = intent.getStringExtra("fname");
        txtDisplay.setText(fname);


        back = findViewById(R.id.btnback);
        txtLname = findViewById(R.id.txtLname);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lastname = txtLname.getText().toString();

                intent.putExtra("lastname",fname + " " + lastname);
                setResult(100,intent);
                finish();
            }
        });
    }


}
