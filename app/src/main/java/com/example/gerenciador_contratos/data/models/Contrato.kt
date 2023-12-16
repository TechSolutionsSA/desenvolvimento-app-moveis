package com.example.gerenciador_contratos.data.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.time.LocalDateTime

@Parcelize
data class Contrato(
    val numContrato: Long,
    val valorMensal: Double,
    val valorTotal: Double,
    val dataValidade: LocalDateTime,
    val observacao: String

) : Parcelable
