package com.keremkulac.karakoctekstil.service

import com.keremkulac.karakoctekstil.model.Pattern
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.POST

interface PatternAPI {
    @GET("keremkulac/PatternDataSet/main/patterns.json")
    fun getPatterns(): Single<List<Pattern>>

    @POST("keremkulac/PatternDataSet/main/patterns.json")
    fun addPattern(): Single<List<Pattern>>
}