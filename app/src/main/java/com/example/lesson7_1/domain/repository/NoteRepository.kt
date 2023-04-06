package com.example.lesson7_1.domain.repository

import com.example.lesson7_1.domain.model.Note
import com.example.lesson01_month07.domain.utils.Resource
import kotlinx.coroutines.flow.Flow

interface NoteRepository {
    fun createNote(nOte: Note): Flow<Resource<Unit>>
    fun getAllNotes(): Flow<Resource<List<Note>>>
    fun editNote(nOte: Note): Flow<Resource<Unit>>
    fun deleteNote(nOte: Note): Flow<Resource<Unit>>
}