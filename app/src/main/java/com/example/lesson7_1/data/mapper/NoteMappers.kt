package com.example.lesson7_1.data.mapper

import com.example.lesson01_month07.data.model.NoteEntity
import com.example.lesson7_1.domain.model.Note

fun Note.toEntity() = NoteEntity(
    id, title, desc
)

fun NoteEntity.toNOte() = Note(
    id, title, desc
)