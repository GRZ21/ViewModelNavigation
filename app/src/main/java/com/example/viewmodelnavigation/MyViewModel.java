package com.example.viewmodelnavigation;

import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
   public MediatorLiveData<Integer>number;

    public MediatorLiveData<Integer> getNumber() {
        if (number == null){
            number = new MediatorLiveData<>();
            number.setValue(0);
        }
        return number;
    }

    public void add(int n){
        number.setValue(number.getValue()+n);
        if(number.getValue()<0){
            number.setValue(0);
        }

    }
}
