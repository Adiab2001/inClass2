package com.example.inclassactivity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button add;
    private EditText name,salary;
    private Spinner spinner;
    private ListView lv;
    String empName,empSal,jobType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = findViewById(R.id.add);
        name = findViewById(R.id.name);
        salary = findViewById(R.id.salary);
        spinner = findViewById(R.id.spinner);
        lv = findViewById(R.id.lv);
        String [] spinn = {"Type","Full Time", "Part Time"};
        ArrayAdapter<String> spin = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, spinn);
        spinner.setAdapter(spin);
        ArrayList<String> jobs = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, jobs);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!name.getText().toString().equals("")){
                    empName = name.getText().toString();

                }else{
                    Toast t = Toast.makeText(getApplicationContext(), "Enter name", Toast.LENGTH_SHORT);
                    t.show();
                }
                if(!salary.getText().toString().equals("")){
                    empSal = salary.getText().toString();

                }else{
                    Toast t = Toast.makeText(getApplicationContext(), "Enter Salary", Toast.LENGTH_SHORT);
                    t.show();
                }
                jobType = spinner.getSelectedItem().toString();

                if(!empName.equals("") || !empSal.equals("")){
                    jobs.add(new job(empName, Float.parseFloat(empSal),jobType).toString());
                    lv.setAdapter(adapter);
                }


            }
        });
    }

}


