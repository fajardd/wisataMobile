package com.mws.wisata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel : ViewModel() {
    private val mText = MutableLiveData<String>()

    val text : LiveData<String>
        get() = mText

    fun setText(text : String) {
        mText.value = text
    }
}