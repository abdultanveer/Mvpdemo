package com.example.admin.mvpdemo.main.data.source;

import com.example.admin.mvpdemo.main.data.User;

public interface DataSource {

    void getNoteDb(onNoteLoadedCallback callback);

    interface onNoteLoadedCallback {
        void onNoteloaded(User user);
    }
}
