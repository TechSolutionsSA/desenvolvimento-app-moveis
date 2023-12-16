package com.example.gerenciador_contratos.features.active_contract

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.gerenciador_contratos.data.models.Contrato
import com.example.gerenciador_contratos.repository.ContratosRepository

class ActivesContractsViewModel() : ViewModel() {

    private val contratosRepository = ContratosRepository()

    private val  _contratos: MutableLiveData<ArrayList<Contrato>> = MutableLiveData(arrayListOf())
    val contratos: LiveData<ArrayList<Contrato>> = _contratos


    fun getContratosAtivos(){
        contratosRepository.GetAllContractsActives(onSucess = {
            if (!it.isEmpty())
                _contratos.postValue(it)
        }, onFailure = {

        })
    }
}