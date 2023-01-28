package com.keremkulac.karakoctekstil.util

sealed class FirebaseState{
    object Idle : FirebaseState()
    object Loading : FirebaseState()
    object Success : FirebaseState()
    class FirebaseError(val message: String? = null) : FirebaseState()
}
