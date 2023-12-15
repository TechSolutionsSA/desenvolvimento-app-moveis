package com.example.gerenciador_contratos.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gerenciador_contratos.R
import com.example.gerenciador_contratos.data.models.Contrato

class ContratoAdapter(private val contratos: List<Contrato>) : RecyclerView.Adapter<ContratoAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textViewAssunto: TextView = view.findViewById(R.id.textViewAssunto)
        val textViewEmpresa: TextView = view.findViewById(R.id.textViewEmpresa)
        val textViewDataValidade: TextView = view.findViewById(R.id.textViewDataValidade)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_contrato, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contrato = contratos[position]
        holder.textViewAssunto.text = contrato.assunto
        holder.textViewEmpresa.text = "Empresa: ${contrato.empresa}"
        holder.textViewDataValidade.text = "Validade: ${contrato.dataValidade}"
    }

    override fun getItemCount() = contratos.size
}
