package com.example.admin.mvpdemo;

public class MainPresenter implements MainContract.Presenter{
    MainContract.View view;
    public MainPresenter(MainActivity mainActivity) {
        view = mainActivity;
    }

    @Override
    public void onButtonClicked() {
        view.showToast("data got from db");

    }
}
