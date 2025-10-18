package com.example.notetakingapp.repository

import androidx.lifecycle.LiveData
import com.example.notetakingapp.database.NoteDatabase
import com.example.notetakingapp.model.Note

class NoteRepository(private val db: NoteDatabase) {

    suspend fun addNote(note: Note) = db.getNoteDao().insertNote(note)
    suspend fun updateNote(note: Note) = db.getNoteDao().updateNote(note)
    suspend fun deleteNote(note: Note) = db.getNoteDao().deleteNote(note)

    fun getAllNotes(): LiveData<List<Note>> = db.getNoteDao().getAllNotes()
    fun searchNote(query: String?): LiveData<List<Note>> = db.getNoteDao().searchNote(query)
}
