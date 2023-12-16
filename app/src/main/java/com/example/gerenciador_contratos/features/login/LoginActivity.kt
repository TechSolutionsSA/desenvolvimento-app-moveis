package com.example.gerenciador_contratos.features.login

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.window.SplashScreen
import android.window.SplashScreenView
import androidx.appcompat.app.AppCompatActivity
import com.example.gerenciador_contratos.data.models.Usuario
import com.example.gerenciador_contratos.databinding.LoginLayoutBinding
import com.example.gerenciador_contratos.features.forgetPassword.ForgetPassword
import com.example.gerenciador_contratos.features.home.HomeActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: LoginLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.linkEsqueceSenha.setOnClickListener{
            changeViewForgetPassword()
        }
        binding.botaoEntrar.setOnClickListener{
            ConfirmDatauser()
        }

    }

    private fun ConfirmDatauser(){


        val userApp = Usuario("silvio@gmail.com", "123456")

        var login = binding.inputEmail.text.toString()
        var password = binding.inputSenha.text.toString()
        val user = Usuario(login, password)

        changeForHome()
    }

    private fun changeForHome(){
        var intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }

    fun changeViewForgetPassword(){
        var intent = Intent(this, ForgetPassword::class.java)
        startActivity(intent)
    }
}

