package com.example.lesson7_1.data.repository

import com.example.lesson7_1.data.base.BaseRepository
import com.example.lesson7_1.data.mapper.toEntity
import com.example.lesson7_1.data.mapper.toNOte
import com.example.lesson7_1.data.model.NoteDao
import com.example.lesson7_1.domain.model.Note
import com.example.lesson7_1.domain.repository.NoteRepository
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
    private val noteDAo: NoteDao
) : NoteRepository,
    BaseRepository() {

    override fun createNote(nOte: Note) = doRequest {
        noteDAo.createNote(nOte.toEntity())
    }

    override fun getAllNotes() = doRequest {
        noteDAo.getAllNotes().map {
            it.toNOte()
        }
    }


    override fun editNote(nOte: Note) = doRequest {
        noteDAo.editNotes(nOte.toEntity())
    }

    override fun deleteNote(nOte: Note) = doRequest {
        noteDAo.deleteNOte(nOte.toEntity())
    }
}