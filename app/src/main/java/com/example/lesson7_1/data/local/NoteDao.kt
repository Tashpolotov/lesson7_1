package com.example.lesson7_1.data.local

import androidx.room.*
import com.example.lesson7_1.data.model.NoteEntity

@Dao
interface NoteDao {

    //CRUD
    //C - create
    //R - read
    //U - update
    //D - delete

    @Insert
    suspend fun createNote(notEntity: NoteEntity)

    @Query("SELECT * FROM notes")
    suspend fun getAllNotes(): List<NoteEntity>

    @Update
    suspend fun editNote(notEntity: NoteEntity)

    @Delete
    suspend fun deleteNote(notEntity: NoteEntity)
}