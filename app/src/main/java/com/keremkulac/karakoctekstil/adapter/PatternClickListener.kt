package com.keremkulac.karakoctekstil.adapter

import android.view.View
import com.keremkulac.karakoctekstil.model.Pattern

interface PatternClickListener {
    fun onPatternClicked(pattern: Pattern)
}