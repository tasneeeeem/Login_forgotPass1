package com.example.loginforgotpass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gotoLoginFragment();

    }
    private void gotoLoginFragment(){
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FreamLayoutMain,new LogInFragment());
        ft.commit();
    }
}