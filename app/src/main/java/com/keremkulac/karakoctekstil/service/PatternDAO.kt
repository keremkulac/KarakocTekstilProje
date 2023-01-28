package com.keremkulac.karakoctekstil.service

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.keremkulac.karakoctekstil.model.Pattern

@Dao
interface PatternDAO {

    @Insert
    suspend fun insertAll(vararg patterns : Pattern) : List<Long>

    @Query("SELECT * FROM pattern")
    suspend fun getAllPatterns(): List<Pattern>

    @Query("SELECT * FROM pattern WHERE uuid=:patternId")
    suspend fun getPattern(patternId: Int): Pattern

}

