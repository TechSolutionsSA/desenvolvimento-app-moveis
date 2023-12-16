package com.example.gerenciador_contratos.features.ContratosPendentes

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gerenciador_contratos.R
import com.example.gerenciador_contratos.data.models.Contrato
import com.example.gerenciador_contratos.databinding.ContractActiveListBinding
import com.example.gerenciador_contratos.features.active_contract.adapter.ActiveContractAdapter
import com.example.gerenciador_contratos.features.contratosVencidos.ContratosVencidosViewModel
import com.example.gerenciador_contratos.network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ContratosPendentesActivity : AppCompatActivity() {

    private lateinit var binding: ContractActiveListBinding
    private lateinit var contracts: ArrayList<Contrato>
    private lateinit var adapter: ActiveContractAdapter
    private val viewModel = ContratosPendentesViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ContractActiveListBinding.inflate(layoutInflater)
        binding.Titulo.text = binding.root.context.getString(R.string.stringName, "Contratos Pendentes")
        setContentView(binding.root)
        setUpList()
        setUpObservables()
        viewModel.getContratosPendentes()
    }

    private fun changeElementsVisibility(emptyMessageVisibility: Int = View.GONE,
                                         errorMessageVisibility: Int = View.GONE){
        binding.emptyMensage.visibility = emptyMessageVisibility
        binding.errorMessage.visibility = errorMessageVisibility

    }

    private fun setUpObservables(){
        viewModel.contratos.observe(this){
            contracts.clear()
            contracts.addAll(it)
            adapter.notifyDataSetChanged()
        }
        viewModel.empty.observe(this){
            if (it){
                changeElementsVisibility(emptyMessageVisibility = View.VISIBLE)
            }
        }
        viewModel.error.observe(this){
            if (it){
                changeElementsVisibility(errorMessageVisibility = View.VISIBLE)
            }
        }

    }
    private fun setUpList(){
        contracts = arrayListOf()
        adapter = ActiveContractAdapter(contracts)
        binding.listaContratosAtivos.layoutManager = LinearLayoutManager(this)
        binding.listaContratosAtivos.adapter = adapter
    }

}