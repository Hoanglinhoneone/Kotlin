package model.api

import model.contant.Contants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object UseRetrofit {
    private val retrofit : Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(Contants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val apiService: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}