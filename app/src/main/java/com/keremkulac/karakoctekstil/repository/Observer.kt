package com.keremkulac.karakoctekstil.repository

interface Observer<T> {
    fun onObserve(event : Int,pattern : T)
}