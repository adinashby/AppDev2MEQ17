package com.example.week6part3firebase;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edit_name = findViewById(R.id.edit_name);
        EditText edit_position = findViewById(R.id.edit_position);

        Button btn = findViewById(R.id.btn_submit);

        DAOEmployee dao = new DAOEmployee();

        btn.setOnClickListener(view -> {
            Employee emp = new Employee(edit_name.getText().toString(), edit_position.getText().toString());

//            dao.add(emp).addOnSuccessListener(suc -> {
//                Toast.makeText(this, "Record is inserted", Toast.LENGTH_SHORT).show();
//            }).addOnFailureListener( er -> {
//                Toast.makeText(this, "" + er.getMessage(), Toast.LENGTH_SHORT).show();
//            });

//            HashMap<String, Object> hashMap = new HashMap<>();
//
//            hashMap.put("name", edit_name.getText().toString());
//            hashMap.put("position", edit_position.getText().toString());
//
//            dao.update("-N2XpLT7jxRq09saAeHH", hashMap).addOnSuccessListener(suc -> {
//                Toast.makeText(this, "Record is updated", Toast.LENGTH_SHORT).show();
//            }).addOnFailureListener(er -> {
//                Toast.makeText(this, "" + er.getMessage(), Toast.LENGTH_SHORT).show();
//            });

            dao.remove("-N2XpLT7jxRq09saAeHH").addOnSuccessListener(suc -> {
                Toast.makeText(this, "Record is removed", Toast.LENGTH_SHORT).show();
            }).addOnFailureListener(er -> {
                Toast.makeText(this, "" + er.getMessage(), Toast.LENGTH_SHORT).show();
            });

//            Task<DataSnapshot> dataSnapshot = dao.getAll().addOnSuccessListener(suc -> {
//                Toast.makeText(this, "Record is retrieved", Toast.LENGTH_SHORT).show();
//
//            }).addOnFailureListener(er -> {
//                Toast.makeText(this, "" + er.getMessage(), Toast.LENGTH_SHORT).show();
//            });
//
//            StringBuffer buffer = new StringBuffer();
//
//            for (DataSnapshot childSnapshot: dataSnapshot.getResult().getChildren()) {
//                buffer.append(childSnapshot.getKey() + "\n");
//            }
//
//            AlertDialog.Builder builder = new AlertDialog.Builder(this);
//            builder.setCancelable(true);
//            builder.setTitle("User Entries");
//            builder.setMessage(buffer.toString());
//            builder.show();
//
        });

    }
}