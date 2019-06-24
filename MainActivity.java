package com.example.anany.edittextsandmultipleactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.edit);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et.getText().toString().isEmpty() || et.getText().toString()==null){
                    Toast.makeText(getApplicationContext(), "No text entered", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(), et.getText().toString(), Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
