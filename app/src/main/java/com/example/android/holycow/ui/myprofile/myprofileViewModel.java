package com.example.android.holycow.ui.myprofile;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class myprofileViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public myprofileViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is myprofile fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}