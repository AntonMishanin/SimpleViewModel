package com.paint.simpleviewmodel.data

class DataDependencyFactory {

    fun provideDataManager(): SimpleDataManager{
        val dataSource = SimpleDataSource()
        return SimpleDataManager(dataSource)
    }
}