package com.example.bkt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextNumber1,editTextNumber2;
    private Object TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);

        findViewById(R.id.btnCong).setOnClickListener(this);


        TextView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    @Override
    public void onClick(View view) {
        int num1 = Integer.parseInt(editTextNumber1.getText().toString());
        int num2 = Integer.parseInt(editTextNumber2.getText().toString());
        int result = 0;
        switch (view.getId()){
            case R.id.btnCong:
                result = num1 + num2;
                break;
        }
        Toast.makeText(this, "Kết quả: " + result, Toast.LENGTH_SHORT).show();
    }
}