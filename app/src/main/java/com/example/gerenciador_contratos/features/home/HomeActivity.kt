package com.example.gerenciador_contratos.features.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gerenciador_contratos.databinding.HomeLayoutBinding


class HomeActivity : AppCompatActivity() {

    private lateinit var binding: HomeLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HomeLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    private fun AddEventContractActive(){
        binding.botaoAtivos.setOnClickListener{

        }
    }
}

