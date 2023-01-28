package com.keremkulac.karakoctekstil.repository

import com.google.firebase.database.DataSnapshot

interface FirebaseCallBacks {
    fun onNewPattern(dataSnapshot : DataSnapshot )
}