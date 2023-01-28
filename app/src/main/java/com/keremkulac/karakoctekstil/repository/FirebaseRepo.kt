package com.keremkulac.karakoctekstil.repository

import com.keremkulac.karakoctekstil.model.Pattern

interface FirebaseRepo {
    fun getPatterns() : List<Pattern>
}