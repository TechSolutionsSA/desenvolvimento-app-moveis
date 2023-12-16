package com.example.gerenciador_contratos.features.contratosVencidos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gerenciador_contratos.R
import com.example.gerenciador_contratos.data.models.Contrato
import com.example.gerenciador_contratos.adapter.ContratoAdapter
import com.example.gerenciador_contratos.client.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ContratosVencidosActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var contratoAdapter: ContratoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contratos_vencidos)

        recyclerView = findViewById(R.id.recyclerViewContratosVencidos)
        recyclerView.layoutManager = LinearLayoutManager(this)

        RetrofitClient.apiService.getContratosVencidos().enqueue(object : Callback<List<Contrato>> {
            override fun onResponse(call: Call<List<Contrato>>, response: Response<List<Contrato>>) {
                if (response.isSuccessful) {
                    val contratos = response.body() ?: emptyList()
                    contratoAdapter = ContratoAdapter(contratos)
                    recyclerView.adapter = contratoAdapter
                } else {
                }
            }

            override fun onFailure(call: Call<List<Contrato>>, t: Throwable) {
            }
        })
    }

}