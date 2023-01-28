package com.keremkulac.karakoctekstil.service

import com.keremkulac.karakoctekstil.model.Pattern
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class PatternAPIService {
    //https://raw.githubusercontent.com/keremkulac/KarakocTekstil/master/patterns.json
    //https://raw.githubusercontent.com/keremkulac/PatternDataSet/main/patterns.json
    private val BASE_URL ="https://raw.githubusercontent.com/"
    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(PatternAPI::class.java)

    fun getData() : Single<List<Pattern>> {
        return api.getPatterns()
    }

    fun addData() : Single<List<Pattern>>{
        return api.addPattern()
    }
}