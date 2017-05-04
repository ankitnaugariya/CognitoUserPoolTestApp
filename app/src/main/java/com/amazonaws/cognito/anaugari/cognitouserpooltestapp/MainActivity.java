package com.amazonaws.cognito.anaugari.cognitouserpooltestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void defaultSignIn(View view){
        String username = "anaugari";
        String password = "anaugari";

        signInUser(username, password);
    }

    private void signInUser(String username, String password){

    }
}
