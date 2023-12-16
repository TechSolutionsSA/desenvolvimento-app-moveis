package com.example.gerenciador_contratos.features.active_contract.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gerenciador_contratos.data.models.Contrato
import com.example.gerenciador_contratos.databinding.ContractListItemBinding
import com.example.gerenciador_contratos.features.active_contract.VH.ContratoVH

class ActiveContractAdapter(private val contratos: ArrayList<Contrato>) :RecyclerView.Adapter<ContratoVH>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContratoVH {
        val binding = ContractListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContratoVH(binding)
    }
    override fun getItemCount(): Int {
        return contratos.size;
    }

    override fun onBindViewHolder(holder: ContratoVH, position: Int) {
        holder.bind(contratos[position])
    }
}