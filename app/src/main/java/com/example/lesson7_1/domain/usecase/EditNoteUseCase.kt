package com.example.lesson7_1.domain.usecase

import com.example.lesson7_1.domain.model.Note
import com.example.lesson7_1.domain.repository.NoteRepository
import javax.inject.Inject

class EditNoteUseCase @Inject constructor(
    private val noteRepository: NoteRepository
) {

    fun editNOte(note: Note) = noteRepository.editNote(note)
}