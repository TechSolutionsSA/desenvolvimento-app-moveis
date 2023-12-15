package com.example.gerenciador_contratos.data.models

data class Contrato(
    val numContrato: Int,
    val assunto: String,
    val empresa: String,
    val dataValidade: String
)
