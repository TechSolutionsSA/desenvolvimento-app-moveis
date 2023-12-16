package com.example.gerenciador_contratos.features.forgetPassword

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gerenciador_contratos.databinding.ForgetPasswordLayoutBinding


class ForgetPassword : AppCompatActivity() {

    private lateinit var binding: ForgetPasswordLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ForgetPasswordLayoutBinding.inflate(layoutInflater);
        setContentView(binding.root)
    }
}