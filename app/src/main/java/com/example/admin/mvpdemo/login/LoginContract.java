package com.example.admin.mvpdemo.login;

public interface LoginContract {
    interface  View{
        void showToast();
    }
    interface Presenter{
        void onButtonClicked();
    }
}
