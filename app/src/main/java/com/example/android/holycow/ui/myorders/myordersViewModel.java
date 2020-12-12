package com.example.android.holycow.ui.myorders;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class myordersViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public myordersViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is myorders fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}