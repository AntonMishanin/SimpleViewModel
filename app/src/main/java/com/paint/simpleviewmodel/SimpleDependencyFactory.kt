package com.paint.simpleviewmodel

import com.paint.simpleviewmodel.data.DataDependencyFactory

class SimpleDependencyFactory {

    fun provideViewModelFactory(): SimpleViewModelFactory {
        val dataManager = DataDependencyFactory().provideDataManager()
        return SimpleViewModelFactory(dataManager)
    }
}