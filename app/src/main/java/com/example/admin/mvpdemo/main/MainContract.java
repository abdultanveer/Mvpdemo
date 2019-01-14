package com.example.admin.mvpdemo.main;

public interface MainContract {
    //presenter to view
    interface  View{
        void showToast(String datadb);
        void setTextView(String name);
    }


    // from view to presenter
    interface Presenter{
        void onButtonClicked(String name);
    }
}
