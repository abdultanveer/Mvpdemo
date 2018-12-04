package com.example.admin.mvpdemo.main;

import com.example.admin.mvpdemo.main.data.User;
import com.example.admin.mvpdemo.main.data.source.DataSource;
import com.example.admin.mvpdemo.main.data.source.Repository;

public class MainPresenter implements MainContract.Presenter,DataSource.onNoteLoadedCallback {
    MainContract.View view;
    DataSource repository;
    String name;
    public MainPresenter(MainContract.View mainActivity) {
        view = mainActivity;
        repository = new Repository();
    }

    @Override
    public void onButtonClicked(String name) {
        //view.showToast("data got from db");
        this.name = name;
        repository.getNoteDb(this);
    }

    @Override
    public void onNoteloaded(User user) {
        view.showToast(user.getName()+"\n"+user.getPassword());
        view.setTextView(name);
    }
}
