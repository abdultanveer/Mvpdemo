package com.example.admin.mvpdemo.main;

public interface MainContract {
    //presenter to view
    public interface  View{
        public void showToast(String datadb);
        public void setTextView(String name);
    }


    // from view to presenter
    public interface Presenter{
        public void onButtonClicked(String name);
    }
}
