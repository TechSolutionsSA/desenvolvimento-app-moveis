package com.example.gerenciador_contratos.data.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.Date

@Parcelize
data class Contrato(
    val numContrato: Long,
    val valorMensal: Double,
    val valorTotal: Double,
    val dataValidade: Date,
    val observacao: String

) : Parcelable
