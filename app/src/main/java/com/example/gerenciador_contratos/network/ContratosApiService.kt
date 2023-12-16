package com.example.gerenciador_contratos.network

import com.example.gerenciador_contratos.data.models.Contrato
import retrofit2.Call
import retrofit2.http.GET

interface ContratosApiService {

    @GET
    ("contratos/contratosAtivos")
    fun getContratosAtivos(): Call<ArrayList<Contrato>>

    @GET("contratos/contratosVencidos")
    fun getContratosVencidos(): Call<ArrayList<Contrato>>

    @GET("contratos/contratosPendentes")
    fun getContratosPendentes(): Call<ArrayList<Contrato>>

    @GET("contratos")
    fun getTodosContratos(): Call<ArrayList<Contrato>>

}