package com.paint.simpleviewmodel.data

import com.paint.simpleviewmodel.ContentUi

fun ContentDto.toContentUi() = ContentUi(
    id = this.id,
    title = this.title
)