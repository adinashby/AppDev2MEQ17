package com.example.mvcandroid.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvcandroid.Controller.ILoginController;
import com.example.mvcandroid.Controller.LoginController;
import com.example.mvcandroid.R;
import com.example.mvcandroid.View.ILoginView;
import com.example.mvcandroid.View.LoginView;

public class MainActivity extends AppCompatActivity {
    EditText email, password;
    Button loginButton;
    ILoginController loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.email);
        password = (EditText)findViewById(R.id.password);

        loginButton = (Button) findViewById(R.id.loginb);
        loginPresenter = new LoginController(new LoginView());

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.OnLogin(email.getText().toString().trim(),
                        password.getText().toString().trim(), getApplicationContext());
            }
        });
    }


}