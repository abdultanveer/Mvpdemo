package com.example.admin.mvpdemo.main.data.source.local;

import com.example.admin.mvpdemo.main.data.User;
import com.example.admin.mvpdemo.main.data.source.DataSource;

public class LocalDataSource implements DataSource {
    @Override
    public void getNoteDb(onNoteLoadedCallback callback) {
        //open sqlite db, query user return the queried data
        User user = new User("abdul","pass");
        callback.onNoteloaded(user);
    }
}
