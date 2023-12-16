package com.example.gerenciador_contratos.features.todosContratos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gerenciador_contratos.R
import com.example.gerenciador_contratos.adapter.ContratoAdapter
import com.example.gerenciador_contratos.network.RetrofitClient
import com.example.gerenciador_contratos.data.models.Contrato
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TodosContratosActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var contratoAdapter: ContratoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

}