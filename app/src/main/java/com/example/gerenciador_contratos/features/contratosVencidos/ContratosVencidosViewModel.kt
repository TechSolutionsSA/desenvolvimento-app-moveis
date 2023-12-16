package com.example.gerenciador_contratos.features.contratosVencidos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.gerenciador_contratos.data.models.Contrato
import com.example.gerenciador_contratos.repository.ContratosRepository

class ContratosVencidosViewModel : ViewModel() {

    private val contractsRepository = ContratosRepository()

    private val  _contratos: MutableLiveData<ArrayList<Contrato>> = MutableLiveData(arrayListOf())
    val contratos: LiveData<ArrayList<Contrato>> = _contratos

    private val _empty: MutableLiveData<Boolean> = MutableLiveData(false)
    val empty: LiveData<Boolean> = _empty;

    private val _error: MutableLiveData<Boolean> = MutableLiveData(false)
    val error: LiveData<Boolean> = _error;

    fun getContratosVencidos(){
        contractsRepository.GetAllDueContracts(onSucess = {
            if (it.isEmpty())
                _empty.postValue(true)
            else
                _contratos.postValue(it)
        }, onFailure = {
            _error.postValue(true)
        })
    }
}