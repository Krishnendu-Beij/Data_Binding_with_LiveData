package com.example.databindingwithlivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val liveDataObject = MutableLiveData("What You Give Is What You Get")
    val liveData : LiveData<String>
        get() = liveDataObject

    fun UpdateLiveData() {
        liveDataObject.value = "You Will See It When You Believe It"
    }
}