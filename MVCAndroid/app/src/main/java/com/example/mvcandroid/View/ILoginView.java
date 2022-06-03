package com.example.mvcandroid.View;

import android.content.Context;

public interface ILoginView {
    void OnLoginSuccess(Context context, String message);
    void OnLoginError(Context context, String message);
}
