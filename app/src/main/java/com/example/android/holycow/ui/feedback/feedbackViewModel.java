package com.example.android.holycow.ui.feedback;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class feedbackViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public feedbackViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is feedback fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}