package com.example.viewmodelandroidtest;

import android.util.Log;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    int score = 0;

    public MainViewModel() {
        Log.i("MainViewModel", "ViewModel is created!");
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.i("MainViewModel", "ViewModel is destroyed!");
    }

    public void increment() {
        score++;
    }

    public void decrement() {
        score--;
    }

}
