package com.example.admin.mvpdemo.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.admin.mvpdemo.R;

public class LoginActivity extends AppCompatActivity implements LoginContract.View{

    LoginPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        presenter = new LoginPresenter(this);
    }

    public void handleClick(View view) {
        //1.hey mr presenter someone clicked the button what should i do
        presenter.onButtonClicked();
    }

    @Override
    public void showToast() {
        Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
    }
}
