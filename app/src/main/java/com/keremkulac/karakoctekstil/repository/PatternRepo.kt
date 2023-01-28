package com.keremkulac.karakoctekstil.repository

import android.app.Application
import android.content.Context
import com.keremkulac.karakoctekstil.model.Pattern
import com.keremkulac.karakoctekstil.service.PatternDAO
import com.keremkulac.karakoctekstil.service.PatternDatabase
import java.util.concurrent.Executor
import java.util.concurrent.Executors

class PatternRepo (context: Context){
    private var patternDAO : PatternDAO = PatternDatabase.invoke(context).patternDao()
    private val executor: Executor = Executors.newSingleThreadExecutor()

     suspend fun insertPattern(pattern: Pattern){
            patternDAO.insertAll(pattern)
    }

    suspend fun getAllPatterns(pattern: Pattern){
        patternDAO.getAllPatterns()
    }




}