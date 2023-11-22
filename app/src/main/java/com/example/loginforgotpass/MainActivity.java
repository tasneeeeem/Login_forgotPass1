package com.example.loginforgotpass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    FireBaseServices fbs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gotoSignUpFragment();

        if (fbs.getAuth().getCurrentUser()==null)
           gotoSignUpFragment();

       else{
           gotoLoginFragment();
       }

    }
    private void gotoLoginFragment(){
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FreamLayoutMain,new LogInFragment());
        ft.commit();
    }
    private void gotoSignUpFragment(){
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FreamLayoutMain,new SignUpFragment());
        ft.commit();
    }
    private void gotoForgotPasswordFragment(){
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FreamLayoutMain,new ForgotPasswordFragment());
        ft.commit();
    }
}