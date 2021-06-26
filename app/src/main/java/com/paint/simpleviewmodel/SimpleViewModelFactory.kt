package com.paint.simpleviewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.paint.simpleviewmodel.data.SimpleDataManager

class SimpleViewModelFactory(private val dataManager: SimpleDataManager) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SimpleViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return SimpleViewModel(dataManager) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}