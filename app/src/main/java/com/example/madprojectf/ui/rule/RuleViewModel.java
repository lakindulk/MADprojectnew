package com.example.madprojectf.ui.rule;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RuleViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RuleViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}