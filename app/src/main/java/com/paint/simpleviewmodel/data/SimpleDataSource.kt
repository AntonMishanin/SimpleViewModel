package com.paint.simpleviewmodel.data

class SimpleDataSource {

    fun getContent(): List<ContentDto> = listOf(
        ContentDto(id = 0, title = "Title0"),
        ContentDto(id = 1, title = "Title1"),
        ContentDto(id = 2, title = "Title2")
    )
}