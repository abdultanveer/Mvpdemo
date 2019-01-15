package com.example.admin.mvpdemo.login;

import com.example.admin.mvpdemo.data.Todo;
import com.example.admin.mvpdemo.data.source.Repository;
import com.example.admin.mvpdemo.data.source.TaskDataSource;

public class LoginPresenter implements LoginContract.Presenter, TaskDataSource.GetTaskCallback {
    LoginContract.View view;
    TaskDataSource repository;

    public LoginPresenter(LoginActivity loginActivity) {

        view = loginActivity;
        repository = new Repository();
    }


    @Override
    public void onButtonClicked() {
        // presenter tells the repository to get the data
        repository.getTask(this); //step B
           //view.showToast();
    }

    @Override
    public void onTaskLoaded(Todo task) {
        view.showToast(task); //step E
    }

    @Override
    public void onDataNotAvailable() {

    }
}
