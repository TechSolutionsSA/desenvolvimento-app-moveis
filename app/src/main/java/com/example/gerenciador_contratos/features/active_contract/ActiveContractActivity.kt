package com.example.gerenciador_contratos.features.active_contract

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gerenciador_contratos.R
import com.example.gerenciador_contratos.network.RetrofitClient
import com.example.gerenciador_contratos.data.models.Contrato
import com.example.gerenciador_contratos.databinding.ContractActiveListBinding
import com.example.gerenciador_contratos.features.active_contract.adapter.ActiveContractAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.ArrayList


class ActiveContractActivity : AppCompatActivity() {

    private lateinit var binding: ContractActiveListBinding
    private lateinit var contracts: ArrayList<Contrato>
    private lateinit var adapter: ActiveContractAdapter
    private var viewModel = ActivesContractsViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ContractActiveListBinding.inflate(layoutInflater);
        binding.Titulo.text = binding.root.context.getString(R.string.stringName, "Contratos Ativos")
        setContentView(binding.root)

        setUpList()
        setUpObservables()
        viewModel.getContratosAtivos()
    }

    private fun setUpObservables(){
        viewModel.contratos.observe(this){
            contracts.clear()
            contracts.addAll(it)
            adapter.notifyDataSetChanged()
        }
    }
    private fun setUpList(){
        contracts = arrayListOf()
        adapter = ActiveContractAdapter(contracts)
        binding.listaContratosAtivos.layoutManager = LinearLayoutManager(this)
        binding.listaContratosAtivos.adapter = adapter
    }
}