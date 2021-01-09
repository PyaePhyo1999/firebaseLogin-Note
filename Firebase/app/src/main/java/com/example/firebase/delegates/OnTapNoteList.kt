package com.example.firebase.delegates

import android.view.View
import com.example.firebase.db.entities.NoteEntities

interface OnTapNoteList {
    fun onTapDelete(item : NoteEntities)
    fun onTapItem(item : NoteEntities)
}