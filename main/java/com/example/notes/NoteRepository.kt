package com.example.notes

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData

class NoteRepository(private val noteDao: NoteDao) {
    val allNotes :LiveData<List<Note>> = noteDao.getAllNotes()
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(word: Note) {
        noteDao.insert(word)
    }

    suspend fun delete(note: Note) {
        noteDao.delete(note)
    }

}