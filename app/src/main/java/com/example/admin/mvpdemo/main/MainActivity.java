package com.example.admin.mvpdemo.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.admin.mvpdemo.R;

public class MainActivity extends AppCompatActivity implements MainContract.View{

    MainPresenter mainPresenter;
    EditText nameEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new MainPresenter(this);
        nameEditText =  findViewById(R.id.editTextname);
    }

    public void clickHandler(View view) {
        String name =  nameEditText.getText().toString();
        mainPresenter.onButtonClicked(name);
    }

    @Override
    public void showToast(String datadb) {
        Toast.makeText(this, datadb, Toast.LENGTH_SHORT).show();
        }

    @Override
    public void setTextView(String name) {
        TextView textView = findViewById(R.id.textViewResult);
        textView.setText(name);

    }
}
