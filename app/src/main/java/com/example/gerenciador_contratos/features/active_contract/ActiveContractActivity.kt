package com.example.gerenciador_contratos.features.active_contract

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gerenciador_contratos.databinding.ContractActiveListBinding


class ActiveContractActivity : AppCompatActivity() {

    private lateinit var binding: ContractActiveListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ContractActiveListBinding.inflate(layoutInflater);
        setContentView(binding.root)

    }
}