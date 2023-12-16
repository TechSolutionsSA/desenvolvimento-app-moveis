package com.example.gerenciador_contratos.repository

import com.example.gerenciador_contratos.data.models.Contrato
import com.example.gerenciador_contratos.network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ContratosRepository {

    fun GetAllContractsActives(onSucess: (ArrayList<Contrato>) -> Unit, onFailure: () -> Unit){
        val response = RetrofitClient.apiService.getContratosAtivos()
        response.enqueue(object : Callback<ArrayList<Contrato>> {
            override fun onResponse(
                call: Call<ArrayList<Contrato>>,
                response: Response<ArrayList<Contrato>>
            ) {
                if (response.code() == 200){
                    response.body()?.let{
                        println(it.get(0))
                        onSucess(it)
                    } ?: run {
                        onFailure()
                    }
                }
            }

            override fun onFailure(call: Call<ArrayList<Contrato>>, t: Throwable) {
                t.printStackTrace()
                onFailure()
            }
        })
    }

    fun GetAllPendenciasContracts(onSucess: (ArrayList<Contrato>) -> Unit, onFailure: () -> Unit){
        val response = RetrofitClient.apiService.getContratosPendentes();
        response.enqueue(object : Callback<ArrayList<Contrato>> {
            override fun onResponse(
                call: Call<ArrayList<Contrato>>,
                response: Response<ArrayList<Contrato>>
            ) {
                if (response.code() == 200){
                    response.body()?.let{
                        println(it.get(0))
                        onSucess(it)
                    } ?: run {
                        onFailure()
                    }
                }
            }

            override fun onFailure(call: Call<ArrayList<Contrato>>, t: Throwable) {
                t.printStackTrace()
                onFailure()
            }
        })
    }
    fun GetAllDueContracts(onSucess: (ArrayList<Contrato>) -> Unit, onFailure: () -> Unit){
        val response = RetrofitClient.apiService.getContratosVencidos();
        response.enqueue(object : Callback<ArrayList<Contrato>> {
            override fun onResponse(
                call: Call<ArrayList<Contrato>>,
                response: Response<ArrayList<Contrato>>
            ) {
                if (response.code() == 200){
                    response.body()?.let{
                        println(it.get(0))
                        onSucess(it)
                    } ?: run {
                        onFailure()
                    }
                }
            }

            override fun onFailure(call: Call<ArrayList<Contrato>>, t: Throwable) {
                t.printStackTrace()
                onFailure()
            }
        })
    }
}