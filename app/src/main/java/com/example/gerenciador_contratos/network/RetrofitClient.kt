package com.example.gerenciador_contratos.client

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://contratos-api-production.up.railway.app/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService: ContratosApiService = retrofit.create(ContratosApiService::class.java)

}