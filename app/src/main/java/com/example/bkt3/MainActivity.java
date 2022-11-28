package com.example.bkt3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvTraiCay;
    ArrayList<PhepTinh> arrayTraiCay;
    PhepTinhAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();



        adapter = new PhepTinhAdapter(this, R.layout.dong_trai_cay, arrayTraiCay);
        lvTraiCay.setAdapter(adapter);



        lvTraiCay.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                }
                if(i==1){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, MainActivity3.class);
                    startActivity(intent);
                }
                Toast.makeText(getApplicationContext(),"You click item name: " +adapter.getItem(i), Toast.LENGTH_LONG).show();
            }
        });
        lvTraiCay.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                final int which_item = i;
                AlertDialog builder = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Are you sure?")
                        .setMessage("Do you want to delete this item")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                arrayTraiCay.remove(which_item);
                                adapter.notifyDataSetChanged();
                            }
                        })
                        .setNegativeButton("No", null)
                        .show();
                return false;
            }
        });

    }

    private void AnhXa() {
        lvTraiCay = (ListView) findViewById(R.id.listviewTraiCay);
        arrayTraiCay = new ArrayList<>();
        arrayTraiCay.add(new PhepTinh("Phép cộng",  R.drawable.cong));
        arrayTraiCay.add(new PhepTinh("Phép trừ",  R.drawable.tru));
        arrayTraiCay.add(new PhepTinh("Phép nhân",  R.drawable.nhan1));
        arrayTraiCay.add(new PhepTinh("Phép chia", R.drawable.chia));
        arrayTraiCay.add(new PhepTinh("Logarit",  R.drawable.log));
    }
}