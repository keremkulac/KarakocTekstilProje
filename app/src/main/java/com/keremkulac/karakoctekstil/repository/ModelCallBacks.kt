package com.keremkulac.karakoctekstil.repository

import com.keremkulac.karakoctekstil.model.Pattern

interface ModelCallBacks {

    fun onModelUpdated(list : List<Pattern> )
}