package com.example.admin.mvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MainContract.View{

    MainPresenter mainPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new MainPresenter(this);
    }

    public void clickHandler(View view) {
        mainPresenter.onButtonClicked();
    }

    @Override
    public void showToast(String datadb) {
        Toast.makeText(this, datadb, Toast.LENGTH_SHORT).show();
        }
}
