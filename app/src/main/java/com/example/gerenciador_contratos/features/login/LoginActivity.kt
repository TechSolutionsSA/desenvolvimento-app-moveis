package com.example.gerenciador_contratos.features.login

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gerenciador_contratos.databinding.LoginLayoutBinding
import com.example.gerenciador_contratos.features.forgetPassword.ForgetPassword

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: LoginLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginLayoutBinding.inflate(layoutInflater);
        setContentView(binding.root)
        binding.linkEsqueceSenha.setOnClickListener{
            changeViewForgetPassword()
        }

    }

    fun changeViewForgetPassword(){
        var intent = Intent(this, ForgetPassword::class.java)
        startActivity(intent)
    }
}

