package com.example.admin.mvpdemo.login;

import com.example.admin.mvpdemo.data.Todo;

public interface LoginContract {
    interface  View{
        void showToast(Todo task);
    }
    interface Presenter{
        void onButtonClicked();
    }
}
