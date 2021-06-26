package com.paint.simpleviewmodel.data

import com.paint.simpleviewmodel.ContentUi

class SimpleDataManager(
    private val dataSource: SimpleDataSource
) {

    fun getContent(): List<ContentUi> =
        dataSource.getContent().map { contentDto -> contentDto.toContentUi() }
}