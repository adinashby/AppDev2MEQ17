package com.example.viewmodelandroidtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.viewmodelandroidtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        //mainViewModel = new MainViewModel();
        Log.i("MainActivity", "MainViewModel Initalized!");

        binding.score.setText(String.valueOf(mainViewModel.score));

        binding.plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 //mainViewModel.score++;
                mainViewModel.increment();
                binding.score.setText(String.valueOf(mainViewModel.score));
            }
        });

        binding.minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 //mainViewModel.score--;
                mainViewModel.decrement();
                binding.score.setText(String.valueOf(mainViewModel.score));
            }
        });
    }
}