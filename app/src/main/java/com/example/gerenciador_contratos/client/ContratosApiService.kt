package com.example.gerenciador_contratos.client

import com.example.gerenciador_contratos.data.models.Contrato
import retrofit2.Call
import retrofit2.http.GET

interface ContratosApiService {

    @GET
    ("contratos/contratosAtivos")
    fun getContratosAtivos(): Call<List<Contrato>>

    @GET("contratos/contratosVencidos")
    fun getContratosVencidos(): Call<List<Contrato>>

    @GET("contratos/contratosPendentes")
    fun getContratosPendentes(): Call<List<Contrato>>

    @GET("contratos")
    fun getTodosContratos(): Call<List<Contrato>>

}