package com.example.lesson7_1.data.model

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.lesson01_month07.data.model.NoteEntity

@Database(entities = [NoteEntity::class], version = 1)
abstract class NoteDataBase : RoomDatabase() {

    abstract fun noteDataBase(): NoteDao
}