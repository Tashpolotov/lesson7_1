package com.example.lesson7_1.domain.usecases


import com.example.lesson7_1.domain.repository.NoteRepository

class GetAllNoteUseCase(private val noteRepository: NoteRepository) {

    fun getAllNote() = noteRepository.getAllNotes()
}