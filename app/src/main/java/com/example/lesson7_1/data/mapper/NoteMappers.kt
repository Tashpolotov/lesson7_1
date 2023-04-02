package com.example.lesson7_1.data.mapper

import com.example.lesson7_1.data.model.NoteEntity
import com.example.lesson7_1.domain.model.Note


fun Note.toEntity() = NoteEntity(
    id, title, description
)

fun NoteEntity.toNote() = Note(
    id, title, description
)