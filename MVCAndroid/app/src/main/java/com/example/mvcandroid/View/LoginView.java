package com.example.mvcandroid.View;

import android.content.Context;
import android.widget.Toast;

public class LoginView implements ILoginView {
    @Override
    public void OnLoginSuccess(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void OnLoginError(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

}
