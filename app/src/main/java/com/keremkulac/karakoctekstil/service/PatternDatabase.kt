package com.keremkulac.karakoctekstil.service

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.keremkulac.karakoctekstil.model.Pattern

@Database(entities = arrayOf(Pattern::class), version = 1)
abstract class PatternDatabase : RoomDatabase() {
    abstract fun patternDao() : PatternDAO

    companion object{

        @Volatile private var instance : PatternDatabase? = null
        private val lock = Any()
        operator fun invoke(context: Context) = instance ?: synchronized(lock){
            instance?: makeDatabase(context).also {
                instance = it
            }
        }

        private fun makeDatabase(context : Context) = Room.databaseBuilder(
            context.applicationContext,PatternDatabase::class.java,"patterndatabase").build()
    }
}