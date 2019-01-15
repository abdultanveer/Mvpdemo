package com.example.admin.mvpdemo.data.source.local;

import com.example.admin.mvpdemo.data.Todo;
import com.example.admin.mvpdemo.data.source.TaskDataSource;

/**
 * this class opens the sqlite db, reads it and gets a todo note from db
 */
public class LocalDataSource implements TaskDataSource {


    @Override
    public void getTask(GetTaskCallback callback) {
        //open db, query db and get data from cursor and create a todo obj
        Todo todo = new Todo("android","mvp");  //Step d
        // we're hardcoding
        callback.onTaskLoaded(todo);
    }
}
