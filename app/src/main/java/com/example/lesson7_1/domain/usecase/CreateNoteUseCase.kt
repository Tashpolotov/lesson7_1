package com.example.lesson7_1.domain.usecase

import com.example.lesson7_1.domain.model.Note
import com.example.lesson7_1.domain.repository.NoteRepository
import javax.inject.Inject

class CreateNoteUseCase @Inject constructor(
    private val noteRepository: NoteRepository
) {

    fun createNOte(nOte: Note) = noteRepository.createNote(nOte)
}