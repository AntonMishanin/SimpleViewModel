package com.paint.simpleviewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.paint.simpleviewmodel.data.SimpleDataManager
import com.paint.simpleviewmodel.utils.SingleLiveEvent

class SimpleViewModel(
    private val dataManager: SimpleDataManager
) : ViewModel() {

    val content = MutableLiveData<List<ContentUi>>()
    val showTextEvent = SingleLiveEvent<String>()

    init {
        Log.d("TAG", "init")
        content.value = dataManager.getContent()
    }

    fun showText() = showTextEvent("Test")
}