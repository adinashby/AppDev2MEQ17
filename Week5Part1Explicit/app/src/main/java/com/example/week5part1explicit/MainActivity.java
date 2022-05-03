package com.example.week5part1explicit;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //actionbar title
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("First Activity");

        //EditText
        final EditText mNameEt = (EditText) findViewById(R.id.nameEt);
        final EditText mEmailEt = (EditText) findViewById(R.id.emailEt);
        final EditText mPhoneEt = (EditText) findViewById(R.id.phoneEt);
        //Button
        Button mSaveBtn = (Button) findViewById(R.id.saveBtn);

        //button click listener
        mSaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get data from edit text
                String name = mNameEt.getText().toString();
                String email = mEmailEt.getText().toString();
                String phone = mPhoneEt.getText().toString();

                //activity intent
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("NAME", name);
                intent.putExtra("EMAIL", email);
                intent.putExtra("PHONE", phone);

                startActivity(intent);

            }
        });
    }
}