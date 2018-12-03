package com.example.admin.mvpdemo;

public interface MainContract {
    //presenter to view
    public interface  View{
        public void showToast(String datadb);
    }


    // from view to presenter
    public interface Presenter{
        public void onButtonClicked();
    }
}
