package com.example.bkt3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener{
    private EditText editTextNumber3,editTextNumber4;
    private Object TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        editTextNumber3 = findViewById(R.id.editTextNumber3);
        editTextNumber4 = findViewById(R.id.editTextNumber4);

        findViewById(R.id.btnTru).setOnClickListener(this);

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
        int num1 = Integer.parseInt(editTextNumber3.getText().toString());
        int num2 = Integer.parseInt(editTextNumber4.getText().toString());
        int result = 0;
        switch (view.getId()){
            case R.id.btnTru:
                result = num1 - num2;
                break;
        }
        Toast.makeText(this, "Kết quả: " + result, Toast.LENGTH_SHORT).show();
    }
}
