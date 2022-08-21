package com.example.textautocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textV);
        AutoCompleteTextView autoComplete = findViewById(R.id.autoCompletes);
        String[] cities = {"Kiev", "Moscow", "Berlin", "Sydney", "London", "New York", "Chicago"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, cities);
        autoComplete.setAdapter(adapter);

        autoComplete.setOnItemClickListener((adapterView, view, i, l) -> textView.setText(adapter.getItem(i)));


    }
}