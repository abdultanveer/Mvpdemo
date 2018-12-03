package com.example.admin.mvpdemo.main.data.source;

import com.example.admin.mvpdemo.main.data.source.local.LocalDataSource;

public class Repository implements DataSource {

    DataSource localDataSource;
    public Repository() {
        localDataSource = new LocalDataSource();
    }

    @Override
    public void getNoteDb(onNoteLoadedCallback callback) {
        localDataSource.getNoteDb(callback);
    }
}
