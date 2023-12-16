package com.example.gerenciador_contratos.features.active_contract.VH

import androidx.recyclerview.widget.RecyclerView
import com.example.gerenciador_contratos.R
import com.example.gerenciador_contratos.data.models.Contrato
import com.example.gerenciador_contratos.databinding.ContractListItemBinding
import java.text.SimpleDateFormat
import java.time.format.DateTimeFormatter
import java.util.Date

class ContratoVH(private val binding: ContractListItemBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(contrato: Contrato){
        binding.numContrato.text = binding.root.context.getString(R.string.NumeroContrato, contrato.numContrato.toString())
        binding.dataValidade.text = binding.root.context.getString(R.string.DataDeValidade, FormatData(contrato.dataValidade))
        binding.valorTotal.text = binding.root.context.getString(R.string.ValorTotal, contrato.valorTotal)
    }

    private fun FormatData(data: Date): String{
        val pattern: String = "dd/MM/yyyy"
        val newFormat: SimpleDateFormat = SimpleDateFormat(pattern)
        return newFormat.format(data)
    }
}