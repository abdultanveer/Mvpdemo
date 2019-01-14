package com.example.admin.mvpdemo.login;

public class LoginPresenter implements LoginContract.Presenter {
    LoginContract.View view;

    public LoginPresenter(LoginActivity loginActivity) {
        view = loginActivity;
    }


    @Override
    public void onButtonClicked() {
        view.showToast();
    }
}
