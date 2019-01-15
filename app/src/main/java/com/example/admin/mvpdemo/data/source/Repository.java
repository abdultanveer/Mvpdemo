package com.example.admin.mvpdemo.data.source;

import com.example.admin.mvpdemo.data.source.local.LocalDataSource;

public class Repository implements TaskDataSource {
    TaskDataSource localTaskDataSource;

    public Repository() {
        localTaskDataSource = new LocalDataSource();
    }

    @Override
    public void getTask(GetTaskCallback callback) {
        //if there is no internet connection get the data from local db
        localTaskDataSource.getTask(callback); //step C
    }
}
