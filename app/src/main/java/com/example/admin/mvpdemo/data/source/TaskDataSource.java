package com.example.admin.mvpdemo.data.source;

import com.example.admin.mvpdemo.data.Todo;

public interface TaskDataSource {
    interface GetTaskCallback {

        void onTaskLoaded(Todo task);

        void onDataNotAvailable();
    }

    void getTask( GetTaskCallback callback);

}
