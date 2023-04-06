package com.example.lesson7_1.domain.usecase

import com.example.lesson7_1.domain.repository.NoteRepository
import javax.inject.Inject

class GetAllNotesUseCase @Inject constructor(
    private val noteRepository: NoteRepository
) {

    fun getaAllNotes() = noteRepository.getAllNotes()
}