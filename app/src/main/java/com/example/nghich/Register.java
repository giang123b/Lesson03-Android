package com.example.nghich;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Register extends AppCompatActivity {
    public static final String tag = "Register";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();
        Log.i(tag, "on create!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(tag, "on Start!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(tag, "on Resume!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(tag, "on Pause!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(tag, "on Stop!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(tag, "on Restart!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(tag,"on Destroy!");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}
