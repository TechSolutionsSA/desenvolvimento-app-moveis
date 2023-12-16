package com.example.gerenciador_contratos.features.home

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gerenciador_contratos.databinding.HomeLayoutBinding
import com.example.gerenciador_contratos.features.ContratosPendentes.ContratosPendentesActivity
import com.example.gerenciador_contratos.features.active_contract.ActiveContractActivity
import com.example.gerenciador_contratos.features.contratosVencidos.ContratosVencidosActivity


class HomeActivity : AppCompatActivity() {

    private lateinit var binding: HomeLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HomeLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        AddEventContractActive()
        AddEventDueContracts()
        AddEventPendenciesContracts()
    }

    private fun AddEventContractActive(){
        binding.botaoAtivos.setOnClickListener{
            changeContractsActive()
        }
    }

    private fun AddEventDueContracts(){
        binding.botaoVencidos.setOnClickListener{
            changeDueContracts()
        }
    }

    private fun AddEventPendenciesContracts(){
        binding.botaoPendentes.setOnClickListener{
            changePendenciesContracts()
        }
    }

    private fun changePendenciesContracts(){
        var intent = Intent(this, ContratosPendentesActivity::class.java)

        startActivity(intent)
    }
    private fun changeDueContracts(){
        var intent = Intent(this, ContratosVencidosActivity::class.java)
        startActivity(intent)
    }

    private fun changeContractsActive(){
        var intent = Intent(this, ActiveContractActivity::class.java)
        startActivity(intent)
    }
}

